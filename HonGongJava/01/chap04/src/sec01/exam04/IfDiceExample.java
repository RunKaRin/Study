package sec01.exam04;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // Math.random() = 0이상 1미만의 double타입 난수

        if (num == 1) {
            System.out.println("1번 입니다.");
        } else if (num == 2) {
            System.out.println("2번 입니다.");
        } else if (num == 3) {
            System.out.println("3번 입니다.");
        } else if (num == 4) {
            System.out.println("4번 입니다.");
        } else if (num == 5) {
            System.out.println("5번 입니다.");
        } else { // (num == 6)
            System.out.println("6번 입니다.");
        }
    }
}
