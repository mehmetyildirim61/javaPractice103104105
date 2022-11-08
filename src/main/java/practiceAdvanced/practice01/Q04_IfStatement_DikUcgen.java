package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {

       /* Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b){
            System.out.println("Dikucgen");
        }else{
            System.out.println("Dikucgen degil");
        }
    }
}
