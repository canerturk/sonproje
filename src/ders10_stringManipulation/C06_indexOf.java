package ders10_stringManipulation;
public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a")); // 9 ilk a'nin index'ini dondurur.(a nın bulunduğu numara)
        System.out.println(str.indexOf('c')); // 8 ( çar kanulediyor)
        System.out.println(str.indexOf("hersey")); // 15
        System.out.println(str.indexOf("e",9)); // 13
        // ( 9. karakterden sonraki ilk bulduğu e nin index numarasını gösterir)

        // 13.index'deki e'den bir sonraki e'nin index'ini bulalim

        System.out.println(str.indexOf("e",14)); // 16

        // cumledeki 2.c'nin index'ini yazdirin

        int ilkcindex= str.indexOf("c"); // 8

        System.out.println(str.indexOf("c",ilkcindex+1)); // 22
        //burada ikincş index i tanımlamış (int ilkcindex= str.indexOf("c"))
        // yani c demiş.c den 1 sonra başla ve çıkan ilk c nin index ini bul demiş


        System.out.println(str.indexOf("ali")); // -1 index olarak int dondurmesi bekleniyor
        System.out.println(str.indexOf("x")); // -1

        // java aradığı şeyi bulamıyorsa hata vermez  -1 yazar
    }
}
