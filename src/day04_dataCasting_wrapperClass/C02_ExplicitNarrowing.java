package day04_dataCasting_wrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl1 = 123.6;

        int sayi1 = (int) dbl1;

        System.out.println("Sayi1 : "+ sayi1); // 123

        byte by1 = (byte)sayi1;
        System.out.println("by1 : " + by1); //123

        int sayi2 = 130;
        byte by2 = (byte) sayi2;
        System.out.println("by2 : " + by2);  //-126

        int sayi3 = 150;
        byte by3=(byte) sayi3;
        System.out.println("by3 : " + by3); //

        int sayi4 = 260;
        byte by4 = (byte)sayi4;
        System.out.println("by4 : " + by4);  //
    }
}