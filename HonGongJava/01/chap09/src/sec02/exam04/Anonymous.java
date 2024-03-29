package sec02.exam04;

public class Anonymous {
    private int field;

    public void method(final int arg1, int arg2) {
        final int var1 = 10;
        int var2 = 10;

        field = 10;

//        arg1 = 20; // X
//        arg2 = 20; // X
//
//        var1 = 30; // X
//        var2 = 30; // X

        Calculatable cal = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;

                return result;
            }
        };

        System.out.println(cal.sum());
    }
}
