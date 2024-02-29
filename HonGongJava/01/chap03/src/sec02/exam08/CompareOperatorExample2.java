package sec02.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v1 = 1;
        double v2 = 1.0;
        System.out.println(v1 == v2);   // true

        double v3 = 0.1;
        float v4 = 0.1F;
        System.out.println(v3 == v4);   // false (0.1f는 0.1의 [근사값]0.1000000014901162으로 표현. 따라서 0.1 < 0.1f
        System.out.println((float)v3 == v4);    // true 비교를 할꺼면 이런식으로
    }
}
