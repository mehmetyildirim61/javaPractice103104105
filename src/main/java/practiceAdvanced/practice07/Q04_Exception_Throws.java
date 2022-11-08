package practiceAdvanced.practice07;

public class Q04_Exception_Throws {

    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */
    public static void main(String[] args) {

        System.out.println(randomSayitoplami());
    }
    public static int randomSayitoplami() {

        int sayi1 =(int)(Math.random()*11);
        int sayi2 =(int)(Math.random()*11);
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        if(toplam<12){
            throw new RuntimeException("Sayı 12'den küçük ise hata verir");  //custom exception
        }
        return toplam;
    }
}
