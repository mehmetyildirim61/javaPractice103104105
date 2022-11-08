package day01_variables;

public class C02_variables {

    public static void main(String[] args) {

        // 1- Farkli 3 data türünde variable oluşturun ve bunları yazdırın.

        float price = 99.99F;
        System.out.println("price = " + price);

        String okulIsmi = "Techpro";
        System.out.println("okulIsmi = " + okulIsmi);

        int sayi1 = 20;
        System.out.println("sayi1 = " + sayi1);

        //2- isim ve soyisim için iki variable oluştur ve yazdır

        String isim = "Ahmet Can";
        String soyisim = "Ates";
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int a = 1250;
        int b = 6258;
        System.out.println("İki farklı data türünün toplami " + (a+b));
        System.out.println("İki farklı data türünün toplami " + a+b); //Böyle yazarsan toplama yapmaz, sayıları yanyana yazar, concate işlemi.

        int toplam = a+b;  //Bu da 2. yol, daha çok tercih edilir.
        System.out.println("toplam = " + toplam);
          //4- Bir tamsayi ve bir ondalikli variable olusturun
             //bunlarin toplamini yazdirin

        int x = 40;
        double y = 0.8;
        System.out.println("İki değerin toplamı " + (x+y));

        //5- Char data türünde variable oluştur yazdır

        char deger1 = 'h';
        System.out.println("deger1 = " + deger1);

        //6-Bir tamsayıyla bir harfi toplayınız

        int deg2 = 100;
        char harf = 'n';

        //1. Yol
        int toplam2 = deg2+harf;
        System.out.println("toplam2 = " + toplam2);  //Önce toplam için bir variable oluşturup, sonra yazdırıyoruz.

        //2. yol
        System.out.println("Toplam 2 " + (deg2 + harf)); //işlemi sout içinde yaptırdık




    }




}
