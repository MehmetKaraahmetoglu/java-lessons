package day07_ifStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleriOrnek1 {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ücgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
        Java'da 3'lü karsilastirma olmaz.
        ikili karsilastirmalar yapip
        && veya || operatorleriyle birlestirmeliyiz.

         */

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        }
    }
}
