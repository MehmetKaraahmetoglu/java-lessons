package day14_forLoops;

import java.util.Scanner;

public class C01_sifreKontrolu {
    public static void main(String[] args) {
          /*
        Kullanicidan bir sifre isteyip asagidaki sartlari kontrol edin ve kullaniciya
        düzeltmesi gereken tüm eksikleri söyleyin, eger tüm sartlari sagliyorsa"sifre basariyla kaydedildi" yazdirin
        -ilk harf kucuk olmali
        -son karakter rakam olmali
        -sifre bosluk icermemeli
        -uzunlugu en az 10 karakter olmali
         */

                // flag yontemini kullanalim
                // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim
                boolean flag = true;
                // sartlar birbirinden bagimsiz oldugundan bagimsiz if cumleleri kullanalim
                Scanner scanner = new Scanner(System.in);
                System.out.println("Lutfen sifrenizi giriniz");
                String sifre = scanner.nextLine();

                //         - ilk harf kucuk harf olmali
                char ilkHarf = sifre.charAt(0);
                if (!(ilkHarf>='a' && ilkHarf<='z')){
                    System.out.println("Ilk karakter kucuk harf olmali");
                    flag = false;
                }
                //         - son karakter rakam olmali
                char sonKarakter = sifre.charAt(sifre.length()-1);
                if (!(sonKarakter>='0' && sonKarakter<='9')){
                    System.out.println("Son karakter rakam olmali");
                    flag=false;
                }
                //         - sifre bosluk icermemeli
                if (sifre.contains(" ")){
                    System.out.println("Sifre bosluk icermemeli");
                    flag = false;
                }
                //         - uzunlugu en az 10 karakter olmali
                if (!(sifre.length()>=10)){
                    System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
                    flag=false;
                }


                if (flag){
                    System.out.println("Sifre basarili sekilde kaydedildi");
                }

            }
        }
