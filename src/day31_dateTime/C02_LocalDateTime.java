package day31_dateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // Saat ve tarihi yazdirdik. DateTime
        //2023-08-04T20:10:27.092798300

        System.out.println(tarihSaat.getDayOfWeek()); // FRIDAY

// bir for loop olusturup, 1'den 10000'e kadar olan sayilari toplayin
        // islem suresini nano saniye olarak yazdirin
        LocalDateTime baslamaZamani = LocalDateTime.now(); //Zamani her kullandigimizda önce zamani güncellememiz lazim
        int baslangicZamani = baslamaZamani.getNano();
        int toplam=0;
        for (int i = 1; i <100000 ; i++) {
            toplam += i;
        }
        LocalDateTime bitirmeZamani = LocalDateTime.now(); //yine güncelledik
        int bitisZamani = bitirmeZamani.getNano();
        System.out.println("Islem suresi : " + (bitisZamani - baslangicZamani));
    }
}
