package day_02;

public class C03_MethodCreation {

    public static void main(String[] args) {

           /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
        Orn    : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10
         */

        int number1 = 20;
        int number2 = 10;

        System.out.println("number1 = " + number1);

        System.out.println("number2 = " + number2);

        String value = swapVariables(number1,number2);

        System.out.println(value);

    }

    private static String swapVariables(int number1, int number2) {

        number1 = number2 + number1; // 30 = 10 + 20

        number2 = number1 - number2; // 20 = 30 - 10

        number1 = number1 - number2; // 10 = 30 - 20

        String deger = ("After the swap number1 = " + number1 + "\nAfter the swap number2 = " + number2 );

        return deger;

    }

}
