package day14_forLoops;

import java.util.Scanner;

public class C02_forLoops {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //          sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //          Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic degeri icin pozitif bir tam sayi giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitis degeri icin pozitif bir tam sayi giriniz");
        int bitis = scanner.nextInt();

        if (bitis < baslangic){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        }else {

            int toplam = 0;

            for (int i = baslangic; i <= bitis; i++) {
                //toplam = toplam + i;
                toplam += i;

            }
            System.out.println("sinirlar arasindaki tam sayilarin toplami: " + toplam);
        }


    }
}
