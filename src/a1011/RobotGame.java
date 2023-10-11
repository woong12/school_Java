package a1011;

public class RobotGame {
    public static void main(String[] args) {
        RobotRace a = new RobotRace("A");
        RobotRace b = new RobotRace("B");
        RobotRace c = new RobotRace("C");
        a.start();
        b.start();
        c.start();

        RobotRace2 d = new RobotRace2("D");
        RobotRace2 e = new RobotRace2("E");
        RobotRace2 f = new RobotRace2("F");

        Thread thread1 = new Thread(d);
        Thread thread2 = new Thread(e);
        Thread thread3 = new Thread(f);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RobotRace extends Thread {

    String name;

    public RobotRace(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for(int i = 0; i <= 10; i++) {

            if(name.equals("A")) {
                System.out.println(name);
            } else if(name.equals("B")) {
                System.out.println("\t" + name);
            } else if(name.equals("C")) {
                System.out.println("\t\t" + name);
            }
            
            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        super.run();
    }
}

class RobotRace2  implements Runnable {

    String name;

    public RobotRace2 (String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for(int i = 0; i <= 10; i++) {

            if(name.equals("D")) {
                System.out.println(name);
            } else if(name.equals("E")) {
                System.out.println("\t" + name);
            } else if(name.equals("F")) {
                System.out.println("\t\t" + name);
            }
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}