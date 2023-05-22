package day_03;

import java.util.Scanner;

public class C05_IfElse {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen uzun bir kelime giriniz");

        String word = input.next();

        boolean wordLengthLow = word.length() < 4;
        String newWord = word.trim().substring(word.length() - 3);

        if (wordLengthLow) {

            System.out.println("3 karakterden daha uzun bir kelime girmelisiniz");

        } else {

            System.out.println("Yeni kelime : " + newWord + word + newWord);

        }

    }

}
