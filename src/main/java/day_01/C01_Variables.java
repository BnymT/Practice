package day_01;

public class C01_Variables {

    public static void main(String[] args) {

        //Bir variable olustur, yazdir.
        //syntax : Data Turu + Data Ismı + Atama Operatoru + variable degeri

        int yas = 32;
        int sayi = 50;

        System.out.println("yas = " + yas);

        System.out.println("sayi = " + sayi); // soutv

        System.out.println("----------");

        //String bir data olusturalim -> non-primitive

        String isim = "Ali";

        System.out.println("isim = " + isim);

        System.out.println("----------");

        //Olusturdugun variable'ı farkli bir variable'a kopyala

        int benimYasim = yas;

        System.out.println("benimYasim = " + benimYasim);

        String onunIsmi = isim;

        System.out.println("onunIsmi = " + onunIsmi);

        System.out.println("----------");

        //Ayni satirda coklu variable deklare et

        int yil = 2023, ay = 4 , gun = 21;

        System.out.println("yil = " + yil);

        System.out.println("----------");

        //Bir variable degerini guncelle

        yil = 2024;

        System.out.println("yil = " + yil);

        System.out.println("----------");

        //Bir variable deklere et : x

        double x;

        //Baska bir variable baslat : y

        double y = 12.5;

        //Baska bir variable baslat : z

        double z = 33; //java bunu 33.0 olarak algiladi.

        //x degiskenini y degiskeni ile baslat.

        x = y;

        System.out.println("x = " + x);

        System.out.println("y = " + y);

        System.out.println("----------");

        //y degiskenini 14.9 olarak guncelle.

        y = 14.9;

        System.out.println("x = " + x);

        System.out.println("y = " + y);

        System.out.println("----------");
    }

}
