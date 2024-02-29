package sec02.exam09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array" , "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray ,0, newStrArray, 0, oldStrArray.length);
        // (원본대상, 인덱스, 복붙대상, 인덱스, 복사개수)

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", "); // java, array, copy, null, null
        }
    }
}
