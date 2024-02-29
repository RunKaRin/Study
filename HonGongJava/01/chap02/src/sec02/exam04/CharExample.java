package sec02.exam04;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';          // A
        char c2 = 65;           // A
        char c3 = '\u0041';     // A
        char c4 = '가';         // 가
        char c5 = 44032;        // 가
        char c6 = '\uac00';     // 가

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
