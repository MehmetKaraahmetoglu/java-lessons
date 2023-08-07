package day17_methodOlusturma_methodOverLoading;

import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method budur...",7,8); // b

        System.out.println(C03_MethodOlusturma.isimDuzenle("mehmet", "karaahmetoglu")); //Mehmet Karaahmetoglu

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));  //true

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12)); //6
    }
}
