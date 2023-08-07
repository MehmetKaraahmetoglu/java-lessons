package day14_forLoops;

import java.util.Scanner;

public class C03_forLoops {
    public static void main(String[] args) {
         //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin
        //         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //         Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic degeri icin pozitif bir tam sayi giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitis degeri icin pozitif bir tam sayi giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0; //Tüm if body'lerinde calismasi icin buraya ekledik

        if (baslangic  < bitis){

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;

            }

        }else{

            for (int i = bitis; i <= baslangic ; i++) {
                toplam += i;

            }
            System.out.println("Sirnirlar arasinda  ki sayilarin toplami: " + toplam);
            //soutu else altinda yazmadik cunku for loop tek tek cikti verecekti.biz tek toplam istiyoruz
        }
    }
}
