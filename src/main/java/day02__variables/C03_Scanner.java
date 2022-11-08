package day02__variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz...");
//        String kullaniciIsmi = input.nextLine();
//
//        System.out.println(kullaniciIsmi);

        //Kullanıcıdan yarıçap isteyip dairenin alan ve çevresini hesaplayan kod

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Yaricap degerini giriniz...");
//        double yaricap = scan.nextDouble();
//        System.out.println("yaricapi "+yaricap+" olan dairenin alanı: "+ 314*yaricap*yaricap/100 +" cm2");
//        System.out.println("yaricapi "+yaricap+" olan dairenin çevresi: " + 2*314*yaricap/100 + " cm");

    //Kullanicidan bir dikdörtgenin kısa ve uzun kenarını alıp alan ve çevre hesabı yapın

//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Dikdörtgenin uzun kenarını giriniz...");
//        double uzunKenar = scan2.nextDouble();
//        System.out.println("Dikdörtgenin kısa kenarını giriniz...");
//        double kisaKenar = scan2.nextDouble();
//
//        System.out.println("Dikdortgenin Alani: " + uzunKenar*kisaKenar + " cm2");
//        System.out.println("Dikdortgenin Cevresi: " + (2*uzunKenar+2*kisaKenar) + " cm");

        //Kenar uzunlukları kullanıcıdan alınan üçgenin çevresini hesaplayan kodu yazın.

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz...");

        byte a = scan3.nextByte();
        byte b = scan3.nextByte();
        byte c = scan3.nextByte();

        int cevre = a+b+c;

        System.out.println("Üçgenin çevresi: " + cevre +" cm");

        /*Kullanicidan aldiginiz sekille asagidaki gibi bir görünüm oluşturan kod yaziniz.

                A
               A A
              A A A
         */


        Scanner scan5 = new Scanner(System.in);
        System.out.println("Bir karakter girin...");
        char symbol = scan5.next().charAt(0);
        System.out.println("  " + symbol +"  ");
        System.out.println(" "+symbol+" "+symbol);
        System.out.println(symbol+" "+symbol+" "+symbol);


        }

}
