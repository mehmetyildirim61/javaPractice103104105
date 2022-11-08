package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {

        String str = "$1 $12 €34 €56 $45 €78";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dolarToplami = 0;
        int euroToplami = 0;
        for(String w: arr){

            if(w.contains("$")){
                dolarToplami+=Integer.valueOf(w.replace("$", ""));  //valueof yerine parseInt metodu da olur. Hemen hemen ayni isi yapiyor
            }else{
                euroToplami+=Integer.valueOf(w.replace("€", ""));
            }

        }
        System.out.println("euroToplami = " + euroToplami+"€");
        System.out.println("dolarToplami = " + dolarToplami+"$");

    }





}
