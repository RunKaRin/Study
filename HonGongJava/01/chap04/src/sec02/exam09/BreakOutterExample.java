package sec02.exam09;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (upper == 'B' && lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
