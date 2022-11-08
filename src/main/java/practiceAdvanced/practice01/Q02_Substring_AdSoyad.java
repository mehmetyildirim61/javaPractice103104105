package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz");
//        String ad = input.next();
//        String soyad = input.next();
//        System.out.println("Ad: " +ad+"\nSoyad: "+soyad);

        //2.yol:
        String adSoyad = input.nextLine();
        String ad2 = adSoyad.substring(0, adSoyad.indexOf(" "));
        String soyad2 = adSoyad.substring(adSoyad.indexOf(" "));
        System.out.println("Ad: " +ad2+"\nSoyad: "+soyad2);


    }
}
