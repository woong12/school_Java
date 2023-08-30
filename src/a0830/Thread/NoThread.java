package a0830.Thread;

public class NoThread {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("* ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(". ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
