package practiceAdvanced.practice07;

import java.util.Scanner;

public class Q03_AtbashCode {
    /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");

        String str1 = "abcdefghi jklmnopqrstuvwxyz";
        String str2 = "zyxwvutsr qponmlkjihgfedcba";
        String str3 = scan.nextLine().toLowerCase();

        String sifreli = "";

        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str3.charAt(i) == str1.charAt(j)) {
                    sifreli += str2.charAt(j);
                }
            }

        }
        System.out.println("sifreli = " + sifreli);

        //2. Yol:
        System.out.println("Bir String giriniz");
        String str = scan.nextLine();
        for(int i=0; i<str.length(); i++){
            int index='z'-str.charAt(i);
            System.out.print((char)('a'+index));
        }
    }
}

