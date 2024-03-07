package sec01.exam05;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() { // 재정의
        return company + ", " + os;
    }
}
