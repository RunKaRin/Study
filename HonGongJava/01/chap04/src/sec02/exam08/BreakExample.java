package sec02.exam08;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() *6) +1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("6이 나왔습니다. 종료합니다.");
    }
}
