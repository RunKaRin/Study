package sec01.exam01;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVal1 = "KaRin";
        String strVal2 = "KaRin";

        if (strVal1 == strVal2) {
            System.out.println("strVal1과 strVal2는 참조가 같음"); // 이게 출력됨
        } else {
            System.out.println("strVal1과 strVal2는 참조가 다름");
        }
        if (strVal1.equals(strVal2)) {
            System.out.println("strVal1과 strVal2는 문자열이 같음");
        }

        String strVal3 = new String("KaRin");
        String strVal4 = new String("KaRin");

        if (strVal3 == strVal4) {
            System.out.println("strVal3과 strVal4는 참조가 같음");
        } else {
            System.out.println("strVal3과 strVal4는 참조가 다름"); // new로 만들어서이게 출력됨
        }

        if (strVal3.equals(strVal4)) {
            System.out.println("strVal3과 strVal4는 문자열이 같음");
        }
    }
}
