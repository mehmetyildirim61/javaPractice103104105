package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q04_NestedFor_Matrix {
    /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir integer giriniz");
        int sayi = input.nextInt();

        for(int j=1; j<=sayi; j++){     //satir kontrolu
            for(int i=1; i<=sayi; i++){   //sutun kontrolu
                System.out.print(String.format("%3d", j*i)+" "); // %2d  2 haneli sayi olarak formatlar, duzen icin mukemmel cozum
            }
            System.out.println(); //Sonraki satira gecmek icin
        }

    }
}