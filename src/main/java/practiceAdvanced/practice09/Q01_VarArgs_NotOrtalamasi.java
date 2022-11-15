package practiceAdvanced.practice09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q01_VarArgs_NotOrtalamasi {
    //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.

    public static void main(String[] args) {
        ortalamaHesapla("Ali",95,96,96,100,100,96);
        ortalamaHesapla("Ayse",90,99,100,100);
        ortalamaHesapla("Fatma",90,99,100);
        ortalamaHesapla("Hayriye",90,99,100,86,96);




    }

    public static void ortalamaHesapla(String isim, double... not){

        double toplam=0;
        for(double w : not){

            toplam+=w;
        }

        System.out.println(isim+"'nin not ortalamasi: " + String.format("%.2f", toplam/ not.length)); //String class'ta format metodu boyle kullanilir,
                                                                                    //virgulden sonra 2 basamak demek


    }
}
