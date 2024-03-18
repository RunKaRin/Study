package sec01.exam15;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location1 = subject.indexOf("프로그래밍"); // 인덱스 3번부터 시작
        System.out.println(location1);
        int location2 = subject.indexOf("그래밍"); // 인덱스 5번부터 시작
        System.out.println(location2);
        int location3 = subject.indexOf("자바프로그래밍"); // 해상사항 없음 -1
        System.out.println(location3);

        if (subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련된 책입니다.");
        } else {
            System.out.println("자바와 관련없는책입니다.");
        }
    }
}
