package day_02;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) throws InterruptedException {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz.");

        char ch = input.next().charAt(0);

        System.out.println("Sectiginiz karakter " + "\"" + ch + "\"");

        System.out.println("    " + ch + "\n   " + ch + " " + ch + "\n  " + ch + " " + ch + " " + ch);

    }

}
