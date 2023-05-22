package day_02;

import java.util.Scanner;

public class C01_MethodCreation {

    public static void main(String[] args) {

        // Kullanicidan fahrenheit cinsi deger girmesini isteyin
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8
        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner input = new Scanner(System.in); // input yerine scan de olabilir.

        System.out.println("Lütfen fahrenheit degerini giriniz.");

        double fahrenheit = input.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);

        double celcius = celciusCalculator(fahrenheit);

        System.out.println("celcius = " + celcius);
    }

    private static double celciusCalculator(double fahrenheit) {

        double celcius = (fahrenheit-32)/1.8;

        return celcius;
    }

}
