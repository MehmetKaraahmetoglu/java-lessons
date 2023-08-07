package day26_forEachLoop_constructer;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle= "Java her gecen gun daha zevkli hale geliyor";
        String harf = "a";

        String[] cumleArr =cumle.split("");
        System.out.println(Arrays.toString(cumleArr));
        // [J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , d, a, h, a,  , z, e, v, k, l, i,  , h, a, l, e,  , g, e, l, i, y, o, r]

        int sayac = 0;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }

        }
        if (sayac == 0){
            System.out.println("cümlede aranilan harf yok");
        }else {
            System.out.println("Aradiginiz harf cümle de " + sayac +" kadar kullanilmistir.");
            //Aradiginiz harf cümle de 5 kadar kullanilmistir.
        }


    }
}
