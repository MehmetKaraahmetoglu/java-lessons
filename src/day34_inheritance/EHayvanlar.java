package day34_inheritance;

public class EHayvanlar {


    //Bir class olusturulurken
    //ilerde child classlar olabilir diye dusunuyorsaniz
    //sadece child classlarin ulasmasini istediginiz methodlari
    //protected access modifier ile olusturabilirsiniz
    protected void hareket(){
        System.out.println("hareket ederler");
    }
    protected void solunum(){
        System.out.println("nefes alirlar");
    }
    protected void beslenme(){
        System.out.println("beslenirler");
    }
    protected void cogalma(){
        System.out.println("cogalirlar");
    }
    protected void omur(){
        System.out.println("yasar ve olurler");
    }
}
