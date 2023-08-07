package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {

        //Kullanicidan bir char isteyin
        //girilen char 'dan sonraki 3 karakteri yazdirin.
        //Orn: input : a  output: b,c,d

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii tablosundan bir karakter giriniz.");

        char girilenKrk = scanner.next().charAt(0);
        //scanner.nextChar() method'u olmadigindan
        //Once .next ile String olarak alip, sonra o String'in ilk karakterini alalim

        System.out.println("girilen karakter: " + girilenKrk);
        System.out.println("girilen karakterden sonraki 3 karakter: " +
                        (girilenKrk+1) + ", "+
                       (girilenKrk+2) + ", "+
                        (girilenKrk+3) );

        System.out.println("girilen karakterden sonraki 3 karakter: " +
                (char)(girilenKrk+1) + ", "+
                (char)(girilenKrk+2) + ", "+
                (char)(girilenKrk+3) );
    }
}
