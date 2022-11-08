package day02__variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Kullanicinin girdiği 4 basamaklı sayının ilk ve son rakamının toplamını yazdıran kodu yazınız.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
//        short sayi = input.nextShort();
//        //bir sayının birler basamağını mod 10 ile hesaplatabiliriz.
//
//        int sonRakam = sayi%10;
//        int ilkRakam=sayi/1000;
//
//        System.out.println("ilk rakam + son rakam: " + (ilkRakam+sonRakam));

    // Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        Scanner scan7 = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz...");
        short sayi2 = scan7.nextShort();

        //1'ler basamağındaki sayıyı bulmak için
        int birler = sayi2%10;
        System.out.println("Girdiginiz sayinin birler basamagi: "+birler);

        //10'lar için
        int yeniSayi = sayi2/10;
        System.out.println("yeni sayı :" +yeniSayi);

        int onlar =yeniSayi%10;
        System.out.println("Onlar basamagi: "+ onlar);

        //100'ler basamagi
        int yuzler =sayi2/100;
        System.out.println("Girdiginiz sayinin yüzler basamagi: "+ yuzler);

                    //ÖDEV
        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

        Scanner scan9 = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz...");
        int sayi5 = scan9.nextInt();

        int birler2 = sayi5%10;
        int yeniSayi2 = sayi5/10;
        int onlar2 = yeniSayi2%10;
        int yeniSayi3 = sayi5/1000;
        int binler2 = yeniSayi3%10;
        int onbinler2=sayi5/10000;

        System.out.println("birler+onlar+binler+onbinler basamagi toplam degeri: " + (onbinler2+binler2+onlar2+birler2));

        /*  Daha Güzel Çözüm Önerisi:
      Scanner scan = new Scanner(System.in);
System.out.println("Lütfen 5 basamakli bir sayi giriniz");
int sayi = scan.nextInt();
int ilkBasamak = ( sayi / 10000 ) % 10;
int ikinciBasamak = ( sayi / 1000) % 10;
int dorduncuBasamak = ( sayi / 10) % 10;
int besinciBasamak = sayi% 10;
int toplam = ilkBasamak + ikinciBasamak + dorduncuBasamak + besinciBasamak;

System.out.println("Girdiginiz Sayinin ilk basamagi: " + ilkBasamak + " İkinci Basamagi: " + ikinciBasamak +
        " Dorduncu Basamagi: " + dorduncuBasamak + " Besinci Basamagi: " + besinciBasamak);
System.out.println("Ve bunların toplamı: " + toplam);
         */
    //`HOCANIN ÇÖZÜMÜ:

        Scanner scanS =new Scanner(System.in);
        System.out.println("5 basamaklı bir sayi giriniz");

        int num = scanS.nextInt();
        int ilkIkiRkm=num/1000;
        System.out.println("ilk iki rakam: " + ilkIkiRkm); //12

        int ilkıkiTop= (ilkIkiRkm%10) + (ilkIkiRkm/10); //2+1
        System.out.println("İlk iki rakam toplamı: " + ilkıkiTop); //3

        int sonIkiRkm = (num%100);
        System.out.println("son iki rakam: " + sonIkiRkm); //45

        int sonIkiTop = (sonIkiRkm%10)+(sonIkiRkm/10); //4+5
        System.out.println("son iki rakam toplami: " +sonIkiTop);//9

        int toplam = ilkıkiTop+sonIkiTop;
        System.out.println("İlk iki ve son iki rakam toplamı: " + toplam);


        //  HOCANIN ÇÖZÜMÜ-İNCELE!!!
        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         /* Ornek : Inputs : 853
         Output : Girdiginiz sayinin birler basamagi : 3
                  Girdiginiz sayinin onlar basamagi : 5
                  Girdiginiz sayinin yuzler basamagi : 8
     */
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler3 = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler3);//3
//        sayi=sayi / 10;
        sayi /= 10; //(üST SATIR YERİNE BU DA OLUR)
        System.out.println("ikiBas = " + sayi);//85
        // 2) 10 lar basamagindaki sayiyi bulun
        int onlar3 = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar3);//5
        sayi = sayi / 10;
        // 3) 100 ler basamagindaki sayiyi bulun
        int yuzler3 = sayi;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler3);
    }

}
