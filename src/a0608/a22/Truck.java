package a0608.a22;

public class Truck extends Car {
    int ton;
    void speedUp() {
        velocity += 10;
        System.out.println("속도 " + velocity + " 증가");
    }
}