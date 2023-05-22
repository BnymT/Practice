package day_03;

import java.util.Scanner;

public class C04_NestedIf {

    public static void main(String[] args) {

        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double number = input.nextDouble();
        boolean negativeNumber = number < 0;
        boolean lessThanTen = number < 10;

        if (negativeNumber) {

            System.out.println("Negatif sayi");

        } else {

            if (lessThanTen) {

                System.out.println("Rakam");

            } else {

                System.out.println("Pozitif sayi");

            }

        }


    }

}
