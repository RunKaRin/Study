package sec04.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();    // 전원 on

        int result1 = myCal.plus(5, 6);
        System.out.println("result1 = " + result1); // 11

        byte a = 10;
        byte b = 4;
        double result2 = myCal.divide(a, b);
        System.out.println("result2 = " + result2); // 2.5

        myCal.powerOff();   // 전원 off
    }
}
