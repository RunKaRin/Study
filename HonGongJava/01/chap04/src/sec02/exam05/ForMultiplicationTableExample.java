package sec02.exam05;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.println("ㅡㅡ " + m + "단 ㅡㅡ");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = " + m*n);
            }
        }
    }
}
