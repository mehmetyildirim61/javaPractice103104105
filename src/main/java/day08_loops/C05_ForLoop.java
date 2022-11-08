package day08_loops;

import java.util.Scanner;

public class C05_ForLoop {
    /*
      Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
      tekrarlayan kodu yaziniz
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input.next();
        String ilkSonHarf = kelime.substring(0,1).concat(kelime.substring(kelime.length()-1));

        System.out.println("Tekrar sayisini giriniz");
        int tekrarSayisi = input.nextInt();
        System.out.println(ilkSonHarf.repeat(tekrarSayisi));

        //2. Yol olarak repeat metodu yerine for loop ile de yapilabilir
    }
}
