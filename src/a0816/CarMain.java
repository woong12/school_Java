package a0816;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("test");

        Car myCar = new Car();
        myCar.name = "Sonata";
        myCar.speed = 50;
        myCar.printCar();

        Car yourCar = new Car("G80", 70);
        yourCar.speedUp();
        yourCar.printCar();
    }
}
