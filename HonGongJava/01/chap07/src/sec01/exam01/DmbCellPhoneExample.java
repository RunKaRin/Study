package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        // DmbCellPhone 객체생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시 S24 울트라", "레드", 10);

        // CellPhone 클래스로부터 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        // DmbCellPhone 클래스 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        // CellPhone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOff();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요?");
        dmbCellPhone.receiveVoice("고객님이 가입하신 보험내용을 무료로 점검해드리고 있습니다.");
        dmbCellPhone.sendVoice("보험 가입 안했어요.");
        dmbCellPhone.hangUp();

        // DmbCellPhone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(16);
        dmbCellPhone.turnOffDmb();
    }
}
