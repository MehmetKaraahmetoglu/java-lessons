package day31_dateTime;

import java.time.LocalDate;

public class C01_LokalDate {

    public static void main(String[] args) {

        LocalDate tarih1 = LocalDate.now();
        System.out.println(tarih1); //2023-08-04   Bugünün tarihi

        System.out.println(tarih1.getMonth()); // AUGUST
        System.out.println(tarih1.getMonthValue()); // 8
        System.out.println(tarih1.getDayOfYear()); //216 (yilin 216.günü)

        System.out.println(tarih1.isLeapYear()); // False Artik yil mi?

        LocalDate tarih2 = LocalDate.of(2016,1,1);
        System.out.println(tarih2); // true istedigimiz tarihte bulunan yil artik mi degil mi?

        System.out.println(tarih1.isAfter(tarih2)); // true

        System.out.println(tarih1.withYear(2022)); // 2022-08-04 istedigim yildan tarih

        System.out.println(tarih1.minusYears(3).minusDays(53));
        // 3 yil 53 günce tarih nedir?
        //2020-06-12
        System.out.println(tarih1.plusWeeks(15).plusDays(3));
        // 15 hafta 3 gün sonra tarih ne olucak?
        // 2023-11-20

        System.out.println(tarih1.lengthOfYear());// tarihin uzunlugu?
        //365

        System.out.println(tarih1.lengthOfMonth()); // ayin uzunlugu
        //31


    }
}
