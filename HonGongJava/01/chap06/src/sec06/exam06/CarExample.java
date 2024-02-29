package sec06.exam06;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        // 잘못된 속도 입력
        car.setSpeed(-50);
        System.out.println("현재 속도 : " + car.getSpeed());

        // 올바른 속도 입력
        car.setSpeed(80);
        System.out.println("현재 속도 : " + car.getSpeed());

        // 멈춤
        if (!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("현재 속도 : " + car.getSpeed());
    }
}
