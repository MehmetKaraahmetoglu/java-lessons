package day35_inheritance;

public class EMuhasebe extends DHastane{
    EMuhasebe(){
        System.out.println("Parametresiz Muhasebe constructor'i calisti");
    }
    EMuhasebe(String str){
        System.out.println("String Parametreli Muhasebe constructor'i calisti");
    }
    EMuhasebe(int a){
        this("Mehmet"); //Kendi classinda ki String parametreye sahip constructora'a git dedi)
        System.out.println("int Parametreli Muhasebe constructor'i calisti");
    }

}
