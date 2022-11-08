package practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {
    //Temel 4 matematik işlemi yapan bir kod yazınız.

    public static void main(String[] args) {

        Q04_HesapMakinesi hesapMakinesi = new Q04_HesapMakinesi();
        hesapMakinesi.toplama(5,6,8,9,41,3);
        hesapMakinesi.cikarma(500,200);
        hesapMakinesi.carpma(1,5,6,7);
        hesapMakinesi.bolme(500,20);

    }
}
