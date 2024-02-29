package sec05.exam05;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("950505-1******", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.rrn);
        System.out.println(p1.name);
        System.out.println();

//        p1.nation = "USA";         // final이라
//        p1.rrn = "970707-2******"; // 변경 불가
        p1.name = "고길동";
        System.out.println(p1.name);
    }
}
