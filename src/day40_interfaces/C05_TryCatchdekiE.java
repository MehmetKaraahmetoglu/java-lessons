package day40_interfaces;

public class C05_TryCatchdekiE {
    public static void main(String[] args) {
        /*
        Try catch blogunda ki "e" yakalanan exception'in atandigi variable'dir.
         */

        int a = 20;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) { //ArithmeticException e = yakalananException
           e.printStackTrace(); //Exception'in tüm bilgilerini yazdirir.
            System.out.println(e.getMessage());
        }
    }
}
