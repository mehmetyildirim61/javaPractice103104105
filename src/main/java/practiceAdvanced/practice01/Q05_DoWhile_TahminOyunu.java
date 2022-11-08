package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.

        Scanner input = new Scanner(System.in);

        int sayi;
                            //*********ONEMLI*********
        int rastgeleSayi = (int)(Math.random()*100)+1;    //Math.random 0-1 arasi sayi verir, java rastgele bir sayi verecek.100 ile carparak 0-100 arasina cekecegiz
                                //En fazla 99 verir diye +1 yapiyorum. double veriyor, int e cevirmeliyiz
        System.out.println("rastgeleSayi = " + rastgeleSayi);

        do{
            System.out.println("Lutfen 0-100 arasi bir sayi tahmini giriniz");
            sayi= input.nextInt();
            if(sayi==rastgeleSayi){
                System.out.println("Tebrikler!!");
            }else if(sayi<rastgeleSayi){
                System.out.println("Daha buyuk bir sayi giriniz.");
            }else{System.out.println("Daha kucuk bir sayi giriniz.");}

        }while(sayi!=rastgeleSayi);
            }
}
