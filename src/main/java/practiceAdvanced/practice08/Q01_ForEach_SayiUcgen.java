package practiceAdvanced.practice08;

public class Q01_ForEach_SayiUcgen {

    /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */

    public static void main(String[] args) {
        for (int satir = 1; satir <= 6; satir++) {      //satır kontrolü
            for (int bosluk = 1; bosluk < satir; bosluk++) {    // boşluk yazdırma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {     //sutun kontrolu
                System.out.print(rakam + " ");
            }
            System.out.println();
        }
    }
}
