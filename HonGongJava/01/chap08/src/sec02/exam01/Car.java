package sec02.exam01;

public class Car {
    Tire fLT = new HankookTire();
    Tire fRT = new HankookTire();
    Tire bLT = new HankookTire();
    Tire bRT = new HankookTire();

    void run() {
        fLT.roll();
        fRT.roll();
        bLT.roll();
        bRT.roll();
    }
}
