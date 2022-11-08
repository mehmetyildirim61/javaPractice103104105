package day03_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan alacağınız 2 sayiyi yine kullanıcıya seçtireceğiniz 4 işlemden biriyle işleme koyup sonucu yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama işlemi için 1 \n çıkarma işlemi için 2 \n bölme işlemi için 3 \n çarpma işlemi için 4 \n giriniz");
        int islem = input.nextInt(); //kullanıcının işlem tercihi için bir variable oluşturduk

        System.out.println("Lütfen 2 tamsayı giriniz...");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if(islem==1){
            System.out.println("Toplama işleminin sonucu: "+ num1 +"+" +num2+"="+(num1+num2));
        }else if(islem==2){
            System.out.println("Çıkarma işleminin sonucu: "+ num1 +"-" +num2+"="+(num1-num2));
        }else if(islem==3){
            System.out.println("Bölme işleminin sonucu: "+ num1 +"/" +num2+"="+(num1/num2));
        }else if(islem==4){
            System.out.println("Çarpma işleminin sonucu: "+ num1 +"x" +num2+"="+(num1*num2));
        }else{
            System.out.println("Hatalı giriş yaptınız");
        }


    }

}
