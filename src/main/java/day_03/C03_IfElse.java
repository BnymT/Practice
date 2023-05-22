package day_03;

import java.util.Scanner;

public class C03_IfElse {

    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");

        double number1 = input.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        double number2 = input.nextDouble();
        boolean addition = number1 > 0 && number2 > 0;
        boolean multiplying = 0 > number1 && 0 > number2;
        boolean diffSymbol = (number1 > 0 && number2 < 0) || (number2 > 0 && number1 < 0);


        if (addition) {

            System.out.println("Sayilarin toplami = " + (number1 + number2));

        } else if (multiplying) {

            System.out.println("Sayilarin carpimi = " + (number1 * number2));

        } else if (diffSymbol) {

            System.out.println("Farkli isaretlerle islem yapamazsin");

        } else {

            System.out.println("Sifir carpmaya gore yutan elemandir");

        }

    }

}
