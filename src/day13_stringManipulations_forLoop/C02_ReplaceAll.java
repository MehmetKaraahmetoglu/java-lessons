package day13_stringManipulations_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {
        //Tamamini degistirmek icin buda

        String str ="1Ja4va 8C9a2n5dir.";

        str = str.replace("1","");
        System.out.println(str); // Ja4va 8C9a2n5dir.

        //Sayilarin tamamindan kurtulmak istersek
        //replace() yeterli olmaz

        //Java da sayilar, ozel karakterler, alfabetik karakterlerin
        //tumuyle islem yapmak isterseniz
        //replaceAll((istenenGrup, yeniDeger)

        //ornegin butun sayilarin yerine hiclik atamak icin

        System.out.println(str.replaceAll("\\d" , ""));  //Java Candir.

        /*
        Regex (Regular Expressions)
        \\s : space                                  \\S : space olmayan hersey
        \\s+ : yanyana birden fazla space
        \\d : digits                                 \\D : digit olmayan hersey
        \\w : harf veya rakam                        \\W : harf veya rakam olmayan hersey

         */



    }
}
