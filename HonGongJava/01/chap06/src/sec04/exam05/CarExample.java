package sec04.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn();
        car.run();
        int speed = car.speed;
        System.out.println("현재속도 : " + speed + "km/h");
    }
}
