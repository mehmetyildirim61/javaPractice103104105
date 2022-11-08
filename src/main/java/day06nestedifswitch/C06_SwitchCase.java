package day06nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        // Girilen uc basamakli pozitif bir sayiyi yazi ile yazdiriniz
        // Ex: 568- Besyuzaltmissekiz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();



        int birlerBas = sayi%10;
        int onlarBas = (sayi/10)%10;
        int yuzlerBas = (sayi/100)%10;

        if(sayi<100 || sayi>999){
            System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        }else {
            switch (yuzlerBas) {
                case 1:
                    System.out.print("yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("ucyuz");
                    break;
                case 4:
                    System.out.print("dortyuz");
                    break;
                case 5:
                    System.out.print("besyuz");
                    break;
                case 6:
                    System.out.print("altiyuz");
                    break;
                case 7:
                    System.out.print("yediyuz");
                    break;
                case 8:
                    System.out.print("sekizyuz");
                    break;
                case 9:
                    System.out.print("dokuzyuz");
                    break;
            }

            switch (onlarBas) {
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (birlerBas) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }
    }
}
