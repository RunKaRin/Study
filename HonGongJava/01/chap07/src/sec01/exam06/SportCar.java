package sec01.exam06;

public class SportCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    @Override // final 메소드라 재정의 불가능
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
