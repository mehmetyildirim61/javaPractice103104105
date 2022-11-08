package day09_nestedforloop;

import java.util.Scanner;

public class C01_ForLoop {
    /*
            Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Icinde a ve c harflerinin oldugu bir cumle giriniz");
        String cumle = input.nextLine();

        int counter =0;
        for(int i=0; i<cumle.length()-1; i++){
            if(cumle.charAt(i)=='a' && cumle.charAt(i+1)=='c'){
            counter++;
            }
        }
        System.out.println("yazdiginiz cumlede ac yanyana yazim sayisi: "+counter);

        // Sorunun diger anlamiyla, cumledeki c harfinden onceki tum a larin sayisi:

        int sayac = 0;
        for(int k=0; k<cumle.length(); k++){
            if(cumle.charAt(k)=='a'){
                sayac++;
            }else if(cumle.charAt(k)=='c'){
                break;
            }
        }
        System.out.println("cumledeki ilk c harfinden onceki a harflerinin sayisi: "+sayac);
    }
}
