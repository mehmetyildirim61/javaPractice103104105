package practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q05_MapAdSoyad {
    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {
       String arr[]={"John", "Mark", "Ali"};
       String arr2[]={"Doe", "Twain", "Can"};

        Map<String, String> adSoyad = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            adSoyad.put(arr[i],arr2[i]);
        }
        System.out.println("adSoyad = " + adSoyad);  //adSoyad = {John=Doe, Mark=Twain, Ali=Can}

    }
}
