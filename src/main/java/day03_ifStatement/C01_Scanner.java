package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {


        /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.
   */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir isci bir isi kaç gunde bitirmektedir: ");
        double bitirmeSuresi = input.nextDouble();
        System.out.println("İşçi sayısını giriniz: ");
        int isciSayisi = input.nextInt();

        double birlikteBitirmeSuresi= bitirmeSuresi/isciSayisi;
        System.out.println("Birlikte bitirme süresi: " + birlikteBitirmeSuresi);
    }

}
