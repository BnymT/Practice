package day_01;

public class C05_MethodCreation {

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz

    //3 ve 5 -> 34 yazdiracak
    //methodum sadece yazdirma islemi yapacak bu yuzden return type void olabilir

    public static void main(String[] args) {

        kareTopla(3,5); //argument
        kareTopla(10,100);
        kareTopla(4,9);

    }
    public static void kareTopla(int sayi1, int sayi2)
    {

        int sonuc = sayi1*sayi1+sayi2*sayi2;

        System.out.println("sonuc = " + sonuc);

    }

}


