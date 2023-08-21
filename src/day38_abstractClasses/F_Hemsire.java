package day38_abstractClasses;

public abstract class F_Hemsire extends D_Personel {
    /*
    Abstract bir class'i parent edinen
    abstract child class, parent classda ki zorunlu methodlari
    implement etmek zorunda degildir.

    Parent'daki abstract methodlari implement etmek zorunda degildir,
    ama isterse implement edebilir.

     */
    public abstract void sertifika();
    public abstract void nobet();

    @Override
    public void genel() {
        System.out.println("Deneme icin yaptim.");
    }

    @Override
    public void standartMaas() {
        System.out.println("Tüm hemsireler icin standart maas 20.000 TL.");
    }
}
