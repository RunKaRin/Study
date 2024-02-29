package sec03.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("김자바", "950505-1******");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.rrn : " + k1.rrn);

        Korean k2 = new Korean("박자바", "960707-2******");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.rrn : " + k2.rrn);
    }
}
