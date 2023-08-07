package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan notunu isteyin.
        // 50 ve üzeriyse "Sinifi gectin."
        // degilse "Malesef kaldin." yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        double not = scanner.nextDouble();

        if (not>=50) System.out.println("sinifi gectin");
        if (not<50) System.out.println("malesef kaldin");

        /*
        Eger bir sart icin sadece 2 durum soz konusu ise
        iki durumu ayri ayri kontrol etmek yerine tek bir kontrol ile de yapabiliriz.

        Bagimsiz if cumlelerinden farkli olarak If else cumlelerinde ya if body'si ya else body'si calisir.

        IKISININ  BIRDEN CALISMASI mümkun olmadigi gibi
        IKISININ DE CALISMASI mümk+n degildir.
         */

        if (not>=50) {
            System.out.println("sinifi gectin");
        } else {
            System.out.println("malesef kaldin");
        }
    }
}
