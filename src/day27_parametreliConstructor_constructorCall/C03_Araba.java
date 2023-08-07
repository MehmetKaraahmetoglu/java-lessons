package day27_parametreliConstructor_constructorCall;

public class C03_Araba {
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Renk belirtilmemis";

    C03_Araba(){
        //herhangi bir class'a görünür bir constructor olusturursaniz
        //default constructor silinir.
        //daha önce default constructor'i kullanan baska class'larda
        //default constructor'in silinmesi sorun olusturabilir
        //GENEL  UYGULAMA OLARAK
        //Bir class'a görünür bir parametreli constructor olusturursak
        //soruna sebebiyet vermemek icin
        //default constructor yerine parametresiz bir const. da olusturmaliyiz.
    }

    C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk){

        marka = mrk ;
        model = mdl ;
        yil = yl ;
        fiyat = fyt ;
        renk = rnk ;
    }



    public String toString() {
        return "Araba bilgileri ==>" +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' ;
    }
}

