package day07_stringmanipulations;

import java.util.Scanner;

public class C07_StringManipulationsLength2 {

    // Kullanicidan 4 harfli bir kelime iste ve girilen kelimeyi tersten yazdir

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = input.nextLine();

        if(kelime.length()==4){
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersten yazilmis hali: " + dort+uc+iki+bir);
        }else {
            System.out.println("girdiginiz kelime 4 karakterli olmalidir");
        }


    }
}
