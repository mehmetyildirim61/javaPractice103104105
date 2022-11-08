package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {

    public static void main(String[] args) {

        String str1 = "Hi";
        System.out.println(str1.isEmpty()); //false

        String str2 = "";
        System.out.println(str2.isEmpty()); //true

        String str3 = " ";
        System.out.println(str3.isEmpty());  //false

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str4 = input.nextLine();

        if(str4.replaceAll("\\S", "").length()>0){
            System.out.println("Bosluk var");
        }else{
            System.out.println("Bosluk yok");
        }
    }
}
