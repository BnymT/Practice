package day_02;

import java.util.Scanner;

public class C02_Scanner {

    // Kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    // yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz.");

        double number1 = input.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz.");

        double number2 = input.nextDouble();

        System.out.println(areThereEqual(number1,number2));

    }

    private static boolean areThereEqual(double number1, double number2) {

        boolean areThereEq;
        double a2 = number1 * number1;
        double b2 = number2 * number2;
        return areThereEq = a2==b2;

    }

}
