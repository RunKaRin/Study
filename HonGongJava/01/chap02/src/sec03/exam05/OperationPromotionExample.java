package sec03.exam05;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2;    // 컴파일 에러
        int intValue1 = byteValue1 + byteValue2;
        System.out.println("intValue1 = " + intValue1); // 30

        char charValue1 = 'A';
        char charValue2 = 1;
//        char charValue3 = charValue1 + charValue2;    // 컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 = " + intValue2);          // 66
        System.out.println("출력문자 = " + (char)intValue2);    // B

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println("intValue4 = " + intValue4); // 2

        int intValue5 = 10;
//        int intValue6 = 10 / 4.0;     // 컴파일 에러
        double doubleValue = 10 / 4.0;
        System.out.println("doubleValue = " + doubleValue); // 2.5

        int x = 1;
        int y = 2;
        double relust = (double) x / y;
        System.out.println("relust = " + relust);   // 0.5
    }
}
