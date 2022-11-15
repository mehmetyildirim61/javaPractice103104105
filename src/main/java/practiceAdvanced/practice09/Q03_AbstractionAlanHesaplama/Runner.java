package practiceAdvanced.practice09.Q03_AbstractionAlanHesaplama;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4,2));

        System.out.println(new Dikdortgen().alanHesapla(5,4)); //boyle de obj eolusturup kullanabiliriz
        // Ama bu sekil tavsiye edilmez, objeyi 1 kere kullaniriz burada, ama objeyi once olusturup kullansak istedigimiz kadar kullaniriz.
    }
}
