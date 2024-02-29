package sec05.exam05;

public class Person {
    // 필드
    final String nation = "Korea";
    final String rrn;   // resident registration number
    String name;

    // 생성자
    public Person(String rrn, String name) {
        this.rrn = rrn;
        this.name = name;
    }
}
