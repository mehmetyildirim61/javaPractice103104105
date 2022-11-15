package practiceAdvanced.practice09;

import java.util.HashMap;

public class Q02__Map_UrunFiyatlariniTopla {

    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
     */

    public static void main(String[] args) {
        HashMap<String, Double> urunFiyatlari=new HashMap<>();

        urunFiyatlari.put("Kemer", 19.99);
        urunFiyatlari.put("Gomlek", 29.99);
        urunFiyatlari.put("Ayakkabı", 89.99);
        urunFiyatlari.put("Kazak", 24.99);
        urunFiyatlari.put("Kravat", 19.99);

        System.out.println("urunFiyatlari.entrySet() = " + urunFiyatlari.entrySet()); //urunFiyatlari.entrySet() = [Kemer=19.99, Kazak=24.99, Kravat=19.99, Gomlek=29.99, Ayakkabı=89.99]
        System.out.println("urunFiyatlari = " + urunFiyatlari); // urunFiyatlari = {Kemer=19.99, Kazak=24.99, Kravat=19.99, Gomlek=29.99, Ayakkabı=89.99}

        double sum=0;
        for(double w: urunFiyatlari.values()){
            sum+=w;
        }
        System.out.println("sum = " + sum); //sum = 184.95
    }


}
