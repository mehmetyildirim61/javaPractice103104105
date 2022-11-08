package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    /*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int arr[] =new int[limit];

        for(int i=0; i<=limit-1; i++){

            System.out.println((i+1)+". sayiyi giriniz");
            arr[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("silmek istediginiz indeksi giriniz");
        int removeIndex=input.nextInt();

        int idx =0;
        int brr[]= new int[limit-1];
        for(int i=0; i<arr.length; i++){
            if(removeIndex!=i){
                brr[idx]=arr[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));

        //2.Yol: Arrrayi Liste cevirip remove yapabiliriz

        List<Integer> list=new ArrayList<>();
        for(int w : arr){
            list.add(w);
        }
        System.out.println(list);

        System.out.println("Silmek istediginiz elementin indeksini giriniz");
        int silinecekEleman =input.nextInt();
        list.remove(silinecekEleman);
        System.out.println(list);

        System.out.println("silmek istediginiz elementi giriniz");
        list.remove(list.indexOf(input.nextInt()));   //elementin indeksini alarak siliyoruz
        System.out.println(list);

    }
}
