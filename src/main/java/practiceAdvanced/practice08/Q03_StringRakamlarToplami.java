package practiceAdvanced.practice08;

import java.util.Scanner;

public class Q03_StringRakamlarToplami {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rakamlar iceren bir String girin");
        String str = input.next();

        rakamlarToplami(str);
    }

        static void rakamlarToplami(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.valueOf(str.substring(i,i+1));
            }
        }
        System.out.println(sum);
    }
}
