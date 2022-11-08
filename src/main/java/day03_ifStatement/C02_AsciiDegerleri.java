package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf = 'a';
        char harf2 = 'A';

        System.out.println("harf>harf2 ==>" +(harf>harf2));//karşılaştırma işlemlerinin sonucu boolean true ya da false döner.

        //1) Herhangi bir char variable'ın ASCII değerlerini kod yazarak bulunuz
        //1.Yol:

        char space = ' '; //Space'i hesaplıyoruz.
        System.out.println("Space'in ASCII değeri: " + (space+0)); //Space'in ASCII değerini hesaplamak için toplamaya etkisi olmayan 0'ı seçeriz. Böylece yazdırdığımız değer bize ASCII değerini verir.

        char m = 'm';
        System.out.println("m'nin ASCII değeri: "+ (m+0));
    //2. Yol:
        int harf3= 'm'; //java'da char karaktere int de atayabiliriz. Çünkü char'ın bir resim karakteri, bir de ASCII değeri vardır. Tek tırnakla yazmamız gerekiyor.
        System.out.println("m'nin ASCII değeri: " +harf3);

        //SORU: Şunları kıyaslayan bir kod yazın:
        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1<b2==> " + (b1<b2));

        //Şunları kıyasla:

        float f1 =2.45645f;
        float f2 = 5.85624f;
        System.out.println("f1>f2==> " + (f1>f2));
        System.out.println("b1>f1==> "+(b1>f1));

        //Şunları da:
        long long1 =4628954528L;
        System.out.println("b1<long1==> " + (b1<long1));

        char ch ='h';
        System.out.println("b1>ch==> " + (b1>ch));







    }

}
