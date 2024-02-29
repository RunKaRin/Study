package sec02.exam03;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]); // 초기갑 0 출력
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]); // 10, 20, 30 출력
        }

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]); // 초기갑 0.0 출력
        }
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]); // 0.1, 0.2, 0.3 출력
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]); // 초기갑 null 출력
        }
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]); // 1월, 2월, 3월 출력
        }
    }
}
