package practiceAdvanced.practice08;

import java.util.ArrayList;
import java.util.List;

public class Q06_List_RastgeleSayi {
    /*
       Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
       Bir List içerisine 0'dan 20'ye rastgele 10 tam sayi atayan ve atanan çift sayıları "ciftSayi" String değerine
       dönüştüren bir kod yazınız. Eğer çift sayi içermezse "Cift Sayi Yoktur" yazdırın.
      Örn:[19, 11, 10, 19, 4, 6, 15, 18, 1, 14]
          [19, 11, CiftSayi, 19, CiftSayi, CiftSayi, 15, CiftSayi, 1, CiftSayi]
      */

    public static void main(String[] args) {

        rastgeleSayi();
    }
    static void rastgeleSayi(){

        List<Object> list = new ArrayList<>();

        for(int i=0; i<10; i++){

            list.add((int)(Math.random()*21));
        }
        System.out.println("list = " + list);

        for(int i=0; i< list.size();i++){
            if((int)list.get(i)%2==0){
                list.set(i,"cift sayi"); //[16, 13, 3, 17, 10, 20, 13, 8, 5, 12]
            }
        }
        System.out.println("list = " + list); //[cift sayi, 13, 3, 17, cift sayi, cift sayi, 13, cift sayi, 5, cift sayi]
        if(!list.contains("cift sayi")){
            System.out.println("cift sayi yoktur");
        }
    }
}
