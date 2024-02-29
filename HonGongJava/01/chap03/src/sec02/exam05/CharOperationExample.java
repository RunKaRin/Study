package sec02.exam05;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
//        char c3 = c2 + 1;   // char변수가 산술연산에 사용되면 int로 변환됨, 컴파일오류
        char c4 = (char)(c2 + 1);
        int x = c2 + 1;
        System.out.println("c1 = " + c1);   // B
        System.out.println("c2 = " + c2);   // A
        System.out.println("c4 = " + c4);   // B
        System.out.println("x = " + x);     // 66
    }
}
