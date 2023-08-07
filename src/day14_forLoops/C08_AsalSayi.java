package day14_forLoops;

import java.util.Scanner;

public class C08_AsalSayi {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen asal sayi kontrolü icin pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        boolean flag  = true;

        for (int i = 2; i < girilenSayi ; i++) {
            if (girilenSayi % i == 0){
                System.out.println("Asal degil");
                flag = false;
                break;
            }

        }

        if (flag){
            System.out.println("girilen sayi, asal sayi");
        }
    }
}
