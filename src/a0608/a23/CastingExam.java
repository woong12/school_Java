package a0608.a23;

public class CastingExam {
    public static void main(String[] args) {
        Car mycar, yourcar;
        Bus mybus, yourbus;
        Truck mytruck, yourtruck;

        // 객체 생성
        mycar = new Car();
        mybus = new Bus();
        mytruck = new Truck();

        // 메소드 호출
        System.out.println("[" + mycar.print() + "]");
        System.out.println("[" + mybus.print() + "]");
        System.out.println("[" + mytruck.print() + "]");

        // 업 캐스팅, 다운 캐스팅
        yourcar = mybus;
        yourbus = (Bus)yourcar;
        System.out.println("[" + yourbus.print() + "]");
        yourcar = mytruck;
        yourtruck = (Truck)yourcar;
        System.out.println("[" + yourtruck.print() + "]");
    }
}
