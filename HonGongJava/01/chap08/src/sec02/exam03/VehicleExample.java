package sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();    // Vehicle 인터페이스에는 해당 메서드가 없음

        Bus bus = (Bus) vehicle;    // 강제 타입 변환
        bus.run();
        bus.checkFare();
    }
}
