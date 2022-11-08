package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 2 karakter giriniz");
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);

        if(char2<char1){
            char temp=char1;
            char1=char2;
            char2=temp;
        }
        for(char i=char1; i<=char2; i++){
            System.out.print(i);
        }

    }

}
