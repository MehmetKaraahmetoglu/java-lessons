package day32_stringBulder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da güzellesiyor");

        sb1.reverse(); // terse cevirir
        System.out.println(sb1); //royisellezüg ad ahad avaJ
        sb1.reverse(); // tekrar ters cevirdik, eski haline getirdik
        System.out.println(sb1); //Java daha da güzellesiyor

        // sb1.deleteCharAt(); //belitilen indexi siler
        //sondaki harfi silelim
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);//Java daha da güzellesiyo

        sb1.delete(9,12); //belirli araligi da sildirebiliriz
        System.out.println(sb1); //Java daha güzellesiyo

        sb1.insert(sb1.length(),"r."); //istedigimiz indexe ekleme yaptik
        System.out.println(sb1); //Java daha güzellesiyor.

        String str = "Java da bundan memnun";
        // 24. satirda ki "da" yi alip sb ye ekleyelim
        sb1.insert(9,str,4,7); // kacinci indexden alicaz, nerden alicaz, aldigimiz yerde ki index araligi
        System.out.println(sb1); //Java daha da güzellesiyor.
    }
}
