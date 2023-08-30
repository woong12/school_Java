package a0830.Thread;

class SingleThread extends Thread {

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

public class SingleThreadExam {
    public static void main(String[] args) {

        SingleThread myThread = new SingleThread();
        myThread.start();

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
