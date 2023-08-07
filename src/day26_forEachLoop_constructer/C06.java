package day26_forEachLoop_constructer;

public class C06 {

    C06(){
        // bu constructor default constructor'in özelliklerine sahiptir
        // ama bu constructor görünür oldugundan, buna default constructor DIYEMEYIZ.
        //bu constructor'i ekledigimiz icin default constructor SILINIR.
    }

    void C06(){
        // bu bir constructor degildir.
        // ama return type'i oldugundan method'dur.
    }

    /*
    c06(){
        // Invalid method declaration; return type required
        // Class adi ile ayni olmadigindan constructor olamaz
        // return type'i olmadigi icin  method'da olamaz
        // bunun icin java altini kirmizi cizer

    }

     */


    /*
    Constructor bazi kaynaklarda ozel bir method diye gecer.
    Ama cogunlugun kabuluyle
    Constructor baska yapilardan farkli, kendisine özgü bir yapidir.

    Constructor, constructor'dir.

    Bir kod blogunun constructor olabilmesi icin
    2 sarti gerceklestirmesi gerekir.

    1 - Ismi class ismi ile ayni olmalidir.
    2 - Return type'i olmaz

     */
}
