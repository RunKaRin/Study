package sec01.exam02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A입니다.");
        } else { // (score < 90)
            System.out.println("점수가 90점 미만입니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
