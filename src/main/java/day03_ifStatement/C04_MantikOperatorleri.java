package day03_ifStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        // && ile & Arası fark: & tüm satırı kontrol eder, && false bulunca durur, devam etmez.

        System.out.println(5+2==8); //boolean döndürür.

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuç 1: " + sonuc1); //True

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuç 2:"+ sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println("sonuç 3:"+ sonuc3);

        //sayi1'in 10 ile 20 aralığında olduğunu true diyerek döndürelim

        //10<sayi1<20 JAVA 3'lü karşılaştırmalar yapmaz.
        //İkili karşılaştırmalar yapıp mantıksal operatörler ile birleştirmeliyiz.

        int sayi1 =15;

        System.out.println("Sonuç 4: " + (10<sayi1 && sayi1<20));

        //Sayi2'nin 10 ile 20 aralığında olmadığını TRUE diye gösteren bir kod yazalım.

        int sayi2 = 5;
        System.out.println("sayi2 10 ile 20 arasında değildir: " +(sayi2<10 || sayi2>20));//veya ile yapınca biri doğru olsa yetiyor.



    }

}
