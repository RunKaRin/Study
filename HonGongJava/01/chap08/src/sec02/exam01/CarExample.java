package sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();
        System.out.println();

        car.fLT = new KumhoTire();
        car.fRT = new KumhoTire();

        car.run();
    }
}
