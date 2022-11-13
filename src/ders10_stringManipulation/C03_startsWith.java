
package ders10_stringManipulation;
public class C03_startsWith {
    public static void main(String[] args) {
        String str = "manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti")); // false
        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true
        System.out.println(str.startsWith("")); // true
        System.out.println(str.startsWith("acarken", 6)); // true
        // 6. endex ve sonrası acarken le mi başlıyor
        System.out.println(str.startsWith("manti",0)); // true
        System.out.println(str.startsWith("java",10)); // false
        //1 index ve sonrası java ilemi başlıyor; hayır yani false
    }
}