package practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_topunSicramasi {

    /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Topun yuksekligini giriniz");
                double height = input.nextDouble();
        double toplamYol= 0;
        int vurmaSayisi=0;
        do{
            vurmaSayisi++;
            toplamYol+=height;     //Topun duserkenki katettigi mesafe
            height=height*0.75;   //zipladiktan sonraki yeni yukseklik
            toplamYol+=height;     //ziplama sonrasi yukari yonlu aldigi mesafe
        }
        while(height>1);

        System.out.println("vurmaSayisi = " + vurmaSayisi);

        NumberFormat numberFormat = new DecimalFormat(".#");  //format ayarliyoruz

        System.out.println("toplamYol = " + numberFormat.format(toplamYol));
    }

}
