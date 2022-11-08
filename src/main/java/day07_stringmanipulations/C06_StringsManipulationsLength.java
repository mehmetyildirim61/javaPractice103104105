package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringsManipulationsLength {

    public static void main(String[] args) {

        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length()); //19

        //Kullanicidan isim ve soisim iste. Hangisi daha uzun, yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi ve soyisminizi giriniz: \n isminiz:");
        String isim = input.nextLine();
        System.out.println("Soyisminiz: ");
        String soyisim = input.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("isminiz soyisminizden uzun");
        } else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle ayni uzunlukta");
        }else{
            System.out.println("soyisminiz isminizden uzun");
        }
    }
}