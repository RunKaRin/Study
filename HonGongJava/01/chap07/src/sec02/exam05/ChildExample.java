package sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        parent.field2 = "data2";    // 불가능
//        parent.method3();           // 불가능

        Child child = (Child) parent; // 강제 타입 변환
        child.field2 = "data2";
        child.method3();
    }
}
