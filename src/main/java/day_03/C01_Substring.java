package day_03;

import java.util.Scanner;

public class C01_Substring {

    public static void main(String[] args) {

        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz");

        String nameSurname = input.nextLine();

        // next methodu sadece space e kadar olan kismi alir
        // Space index bulurum
        // 0'dan spaceind kadar olan kismi substring ile alirim

        int speaceIndex = nameSurname.indexOf(" ");

        // Substring methodunun 2 formu vardir
        // 1. substring(index) --> yazilan indexten sonuna kadar olan kismi string olarak doldurur.
        // deniz --> substring(3) --> iz
        // 2. substring(index1, index2) --> index1 dahil, index2 haric olmak uzere index1 den index2 ye kadar olan kisim string doner
        // deniz --> substring (2,4) --> ni

        String name = nameSurname.trim().substring(0,speaceIndex);
        String surname = nameSurname.trim().substring(speaceIndex + 1);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        // canan can

        char nameFirstLetter = name.toUpperCase().charAt(0);
        String cName = name.substring(1).toLowerCase();
        name = nameFirstLetter + cName; // concatenation --> ilk harf buyuk gerisi kucuk
        char surnameFirstLetter=surname.toUpperCase().charAt(0);
        String soyadKalan=surname.substring(1).toLowerCase();
        surname=surnameFirstLetter+soyadKalan;
        System.out.println("===========================================");
        System.out.println("Ad : "+ name);
        System.out.println("Soyad : "+ surname);

    }

}
