package a0816;

public class Car {
    String name;
    int speed;

    public Car() {
        super();
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void speedUp() {
        speed += 10;
    }
    
    void speedDown() {
        speed -= 10;
    }

    void printCar() {
        System.out.println(name + " speed: " + speed);
    }



}