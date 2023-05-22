package day_03;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int number = input.nextInt();

        boolean lessThanThree = number > 99;

        String isItLessThanThree = lessThanThree ? "3 ve ya daha cok basamaklidir" : "3 basamakli degildir";

        // Hocanin cozumu

        basamakSayisi(number); // argument

    }

    private static void basamakSayisi(int number) { // Parameter

        System.out.println(number > 99 || number <-99  ? "3 ve ya daha cok basamaklidir" : "3 basamakli degildir");

    }

}
