package sec01.exam03;

import java.util.HashMap;

public class MemberExample {
    public static void main(String[] args) {
        // Member 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Member, String> hashMap = new HashMap<Member, String>();

        // 식별키 new Member("1")로 "홍길동"을 지정함
        hashMap.put(new Member("1"), "홍길동");

        // 식별키 new Member("1")로 "홍길동"을 읽어옴
        String value = hashMap.get(new Member("1"));
        System.out.println(value);
    }
}