package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time= LocalTime.now();
        //Bu konuda new localtime kullanamiyoruz bunun yerine hayir methodu kullaniyoruz

        System.out.println(time); //21:37:32.391582700    sondaki sayilar ise zaman birimi,nano salise vs

        System.out.println(time.getHour()); // 21 saati getirir

        System.out.println(time.getMinute());// 40  dakikayi getirir

        System.out.println(time.minusMinutes(1000));//1000 dk once saat kacti?
        //05:01:37.641221300

        System.out.println(time.minusHours(100));// 100 saat once ki saati yazdirir
        //17:42:43.055113500

        System.out.println(time.plusSeconds(10000));// 10000 saniye sonraki saati gösterir
        //00:30:10.588005100

        System.out.println(time.withHour(15)); // dakika ve saniye icinde oldugun zamanla ayni sadece saati 15 yap
        //15:44:28.760350

        System.out.println(time.withSecond(0).withNano(0)); // 21:45

        LocalTime time1 = LocalTime.of(12,35);

        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true

        System.out.println(time1.isAfter(time2)); // false
    }
}
