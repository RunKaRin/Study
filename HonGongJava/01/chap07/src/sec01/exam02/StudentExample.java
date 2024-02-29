package sec01.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("카린", "950505-1******", 1);
        System.out.println("name : " + student.name);
        System.out.println("rrn : " + student.rrn);
        System.out.println("number : " + student.number);
    }
}
