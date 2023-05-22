package day_01;

public class C06_MethodCreation {

    public static void main(String[] args) {

        //Kare prizmanın hacmini bulan ve donduren bir method yazınız
        //Kare prizma hacmi = taban alani * yukseklik = a*a*h
        
        int tabanKenari = 3;
        int yukseklik = 4;

        System.out.println("karePrizmaHacmi(3,4) = " + karePrizmaHacmi(3, 4));

        System.out.println("karePrizmaHacmi(tabanKenari, yukseklik) = " + karePrizmaHacmi(tabanKenari, yukseklik));
    }

    //Access mod + static + return type + isim + () + {}
    //return types : public, default, private, protected
public static int karePrizmaHacmi (int tabanKenar, int yukseklik)
{

    int hacim = tabanKenar * tabanKenar * yukseklik;

    return hacim;


}

}
