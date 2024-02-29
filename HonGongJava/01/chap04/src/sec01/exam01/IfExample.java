package sec01.exam01;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90점 미만입니다.");
            System.out.println("등급은 B입니다.");    // if문에서 중괄호 없이는 한줄만 적용됨.
                                                    // 즉, 14라인은 들여쓰기만 있는 일반 출력문
    }
}
