package day08_loops;

import java.util.Scanner;

public class C03_ForLoop {
    /*
      Kullanicidan bir cumle ve bir harf alin,
      Cumlede verilen harfin kac kere
      kullanildigini bulup, yazdirin
      ORNEK:
      INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
      OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = input.nextLine();
        System.out.println("Cumlede aramak istediginiz harfi giriniz");
        String harf = input.next().substring(0, 1);

        int counter =0;
        for (int i=0; i<cumle.length(); i++){
            if(cumle.substring(i, i+1).equalsIgnoreCase(harf)){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Girdiginiz harf cumlede bulunmamaktadir");
        }else{
            System.out.println("Girdiginiz harf cumlede "+counter+" defa kullanilmistir");
        }
    }
}
