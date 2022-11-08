package day07_stringmanipulations;

import java.util.Scanner;

public class C09_StringManipulations {

    //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("gmail adresinizi giriniz");
        String email = input.nextLine();

        if(!email.contains("@gmail")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazimı kontrol edin");
        }
    }
}
