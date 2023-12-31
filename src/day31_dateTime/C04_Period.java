package day31_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        //Kullanicinin verdigi dogum tarihine gore
        //kullanicinin yasini yil ve ay olarak yazdiran bir program hazirlayin.

        LocalDate dogumTarihi = LocalDate.of(1990,12,20);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));
        //P32Y7M15D  32 year 7 month 15 day

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); // get year ile yil olarak istedik
        // 32
    }
}
