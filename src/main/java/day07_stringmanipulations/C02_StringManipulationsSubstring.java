package day07_stringmanipulations;

public class C02_StringManipulationsSubstring {

    public static void main(String[] args) {

        /*
         substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

//10.index dahil sonuna kadra verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";
         String yeniCumle = cumle.substring(10);
        System.out.println(yeniCumle);


//son 10 harfi yazdirin >>>>gibi olsa:
        String yeniCumle2 = cumle.substring(cumle.length()-9);
        System.out.println(yeniCumle2);

// ilk 10 karakteri alma yontemi
        String yeniCumle3 = cumle.substring(0, 10);
        System.out.println(yeniCumle3);

// 11.ci karakterden sonuna kadar olan Stringi yazdiralim

        String yeniCumle4 = cumle.substring(10);
        System.out.println(yeniCumle4);
    }
}
