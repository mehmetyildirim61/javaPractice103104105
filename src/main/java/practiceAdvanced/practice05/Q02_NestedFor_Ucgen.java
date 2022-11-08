package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {
    /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satirSayisi = input.nextInt();

        for(int i =0; i<satirSayisi; i++){

            for(int bosluk =satirSayisi-i; bosluk>1; bosluk--){
                System.out.print(" ");
            }
            for(int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
