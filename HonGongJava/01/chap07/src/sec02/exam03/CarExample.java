package sec02.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i < 10; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.fLT = new Tire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.fRT = new Tire("앞오른쪽", 15);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.bLT = new Tire("뒤왼쪽", 15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.bRT = new Tire("뒤오른쪽", 15);
                    break;
            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        }
    }
}
