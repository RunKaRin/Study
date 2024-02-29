package sec02.exam02;

public class FieldIntValueExample {
    public static void main(String[] args) {

        FieldIntValue fiv = new FieldIntValue();

        System.out.println("byteField : " + fiv.byteField);             // 0
        System.out.println("shortField : " + fiv.shortField);           // 0
        System.out.println("intField : " + fiv.intField);               // 0
        System.out.println("longField : " + fiv.longField);             // 0
        System.out.println("booleanField : " + fiv.booleanField);       // false
        System.out.println("charField : " + fiv.charField);             // 정의되지 않은(unspecified) 값
        System.out.println("floatField : " + fiv.floatField);           // 0.0
        System.out.println("doubleField : " + fiv.doubleField);         // 0.0
        System.out.println("arrField : " + fiv.arrField);               // null
        System.out.println("referenceField : " + fiv.referenceField);   // null
    }
}
