package sec04.exam01;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격 : %d원\n", value);     // 123원
        System.out.printf("상품의 가격 : %6d원\n", value);    //    123원
        System.out.printf("상품의 가격 : %-6d원\n", value);   // 123   원
        System.out.printf("상품의 가격 : %06d원\n", value);   // 000123원
    }
}
