package sec02.exam01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 = " + result1); // -100
        System.out.println("result2 = " + result2); // 100

        byte b = 100;
//        byte result3 = -b;  // 연산후 int 타입이므로 컴파일에러
        int result4 = -b;
        System.out.println("result4 = " + result4); // -100
    }
}
