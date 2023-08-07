package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip ay ismini yazdirin yazdirin.

        Scanner scanner=  new Scanner(System.in);
        System.out.println("Yazdirmak istediginiz ay, kacinci ay");

        int ayNo= scanner.nextInt();

        if (ayNo == 1) System.out.println("ocak");
        else if (ayNo == 2) System.out.println("subat");
        else if (ayNo == 3) System.out.println("mart");
        else if (ayNo == 4) System.out.println("nisan");
        else if (ayNo == 5) System.out.println("mayis");
        else if (ayNo == 6) System.out.println("haziran");
        else if (ayNo == 7) System.out.println("temmuz");
        else if (ayNo == 8) System.out.println("agustos");
        else if (ayNo == 9) System.out.println("eylül");
        else if (ayNo == 10) System.out.println("ekim");
        else if (ayNo == 11) System.out.println("kasim");
        else if (ayNo == 12) System.out.println("aralik");
        else System.out.println("Hatali ay numarasi");

        System.out.println("=================");

        switch (ayNo){
            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayis");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasim");
                break;
            case 12 :
                System.out.println("Aralik");
                break;

            default:
                System.out.println("Hatali ay numarasi");
        }
    }
}
