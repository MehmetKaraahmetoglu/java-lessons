package day07_ifStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /*
        Bagimsiz If cumleleri isminden de anlasilacagi uzere
        kod'un kalani ile ilgilenmez.

        Sadece boolean sarta odaklanir
        sartin sonucu true ise if body'calisir
        boolean sartin sonucu false ise
        if body'si devreye girmez

        Yani

        birden fazla bagimsiz if  cumlesi olan bir kod calistiginda
        kac tane if body'sinin calisacagi degerlere baglidir.

        Tum if body'leri calisabilir.
        Bazilari calisabilir
        Ya da hic bir if body'si calismayabilir.

         */
        int a = -201;
        int b = 104;

        if (a>0){
            System.out.println("a sayisi pozitif");

        }

        if (a+b>100){
            System.out.println("sayilarin toplami 100'den buyuk");
        }

        if (b %  3 ==0){
            System.out.println("b 3 ile tam bolunen bir tamsayidir");
        }

        if (b<100){
            System.out.println("b 100'den kucuk bir tamsayidir.");
        }
    }
}
