package sec02.exam06;

public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("이름\t나이\t직업");
        System.out.print("행 단위 출력\n");
        System.out.print("행 단위 출력\n");
        System.out.println("우리는 \"개발자\" 입니다.");
        System.out.println("봄\\여름\\가을\\겨울");
    }
}
//        \t : 탭 만큼 띄움
//        \n : 줄 바꿈
//        \r : 캐리지리턴
//        \" : " 출력
//        \' : ' 출력
//        \\ : \ 출력
//        \ u16진수 : 16진수 유니코드에 해당하는 문자 출력 (\ 다음 u16 은 띠어쓰기 없이인데 오류남)