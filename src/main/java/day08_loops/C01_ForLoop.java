package day08_loops;

import java.util.Scanner;

public class C01_ForLoop {

    //Kullanicidan baslangic , bitis ve artis miktarini alarak
    // aradaki tum sayilari aralarina virgul koyarak yazdirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yazdiracaginiz sayilarin baslangic degerini giriniz");
        int bas = input.nextInt();
        System.out.println("lutfen yazdiracaginiz sayilarin bitis degerini giriniz");
        int bit = input.nextInt();
        System.out.println("lutfen yazdiracaginiz sayilarin artis miktarini giriniz");
        int artis = input.nextInt();

        for(int i=bas; i<=bit; i+=artis){
            System.out.print(i+",");
        }


    }
}
