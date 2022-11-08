package day04ifStatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

          /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        Scanner input =new Scanner(System.in);
        System.out.println("Ogrenci notunu girin");
        String hata =input.nextLine();
        if(hata.replaceAll("[0-9]", "").length()>0){
            System.out.println("Lutfen sadece sayisal deger giriniz");
        }
        int not = input.nextInt();

        if(not>89 && not<=100){
            System.out.println("Cok iyi");
        }else if(not>79 && not<90){
            System.out.println("iyi");
        }else if(not>69 && not<80){
            System.out.println("orta");
        }else if(not>59 && not<70){
            System.out.println("gecer");
        }else if(not<59 && not>=0){
            System.out.println("zayif");
        }else{
            System.out.println("Gecerli bir not degeri girin");
        }
    }
}
