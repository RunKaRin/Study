package sec02.exam07;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 실수값 저장
//        float var1 = 3.14;    // 컴파일 에러, float일 경우 f를 붙여주기
        float var2 = 3.14f;
        double var3 = 3.14;

        // 정밀도 테스트
        float var4 = 0.1234567890123456789f; // 소수점 아래 9자리에서 반올림
        double var5 = 0.1234567890123456789; // 소수점 아래 19자리에서 반올림

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
        System.out.println();

        // e 사용하기
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 3e-3;
        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);
    }
}
