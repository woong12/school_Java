package a0830.Thread;

class MultiThread extends Thread {

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 10; i++) {
            System.out.print(". ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.print("Ô ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    

}

    

public class MultiThreadExam1{
    public static void main(String[] args) {

        // Thread 1
        MultiThread myThread = new MultiThread();
        myThread.start();
        // Thread 2
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();


        for(int i = 0; i < 10; i++) {
            System.out.print(" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
