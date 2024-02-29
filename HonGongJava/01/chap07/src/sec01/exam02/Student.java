package sec01.exam02;

public class Student extends People {
    // 필드
    public int number;

    // 생성자
    public Student(String name, String rrn, int number) {
        super(name, rrn);
        this.number = number;
    }
}
