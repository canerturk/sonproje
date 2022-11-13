
package ders10_stringManipulation;
public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a")); // 21
        //aramaya sondan başlayacak ama baştan başlayan index numarasıyla söyleyecek
        System.out.println(str.lastIndexOf('e')); // 15
        //buradasondan başladı ve beyinin e sini bulup baştan sayılan numarasını verdi.
        //index herzaman baştan başlar.aramaya sondan başlar.
        System.out.println(str.lastIndexOf("java"));
        // -1( küçük j olduğundan yok büyük olsaydı da 0 olurdu
        System.out.println(str.lastIndexOf("Java")); // 0
        System.out.println(str.lastIndexOf("e", 14)); // 11
        //b den geri doğru
    }
}