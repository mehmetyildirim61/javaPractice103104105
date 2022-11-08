package day04ifStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //NOT: Java'da 2 memory var: Heap (büyük) ve Stack (Küçük) Stringde referans değerine de bakıldığından
        //==yerine equals kullanılır

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        //1.YOL:

        String gun = input.next().toLowerCase();
//        if(gun.equals("cuma")){
//            System.out.println("Muslumanlar icin kutsal gun");
//        }
//        if(gun.equals("cumartesi")) {
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//            if(gun.equals("pazar")) {
//                System.out.println("Hristiyanlar icin kutsal gun");
//            }
//            if(!gun.equals("pazar") && !gun.equals("cuma") && !gun.equals("cumartesi")){
//                System.out.println("kutsal gun degil");
//            }

            //2.YOL:

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }else if(gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else
            System.out.println("kutsal gun degil");

    }
}
