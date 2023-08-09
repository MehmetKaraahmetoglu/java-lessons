package day_34_inheritance;

public class DRunner {
    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        //Corolla class'in da ki ozellikler
        System.out.println(corolla.uretimYeri); //Sakarya / Turkiye
        System.out.println(corolla.model); //Corolla
        System.out.println(corolla.aku); //Inci aku
        System.out.println(corolla.sanzimanTuru);//Cvt

        //toyota class'indaki ozelliklar
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Tum toyota araclar Pirelli lastik kullanir.
        System.out.println(corolla.guvenlik); // Tum toyota araclar extra guvenlik icerir.
        System.out.println(corolla.fren); // Toyota araclar ABS fren sistemi kullanir.

        //araba class'indan aldigi ozellikler
        System.out.println(corolla.yakit); // Yakit türü belirtilmedi
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // Renk belirtilmedi
    }
}
