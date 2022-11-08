package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelcius {  //Snakecase buradaki yazim sekli

    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen fahrenheit degeri giriniz");
        double fahrenheit = input.nextDouble();

        double celcius = (fahrenheit-32)*5/9;
        System.out.println(celcius);

        NumberFormat numberFormat = new DecimalFormat(",##"); // Burada NumberFormat classindan obje olusturuyoz. konsolda virgul sonrasi gosterecegi basamak sayisi ayarlama
                                //Yani bu klasta olusturacagimiz tum objelerde nokta sonrasi 2 hane kullan demis olduk
        String formattedCelcius = numberFormat.format(celcius);
        System.out.println("formattedCelcius: " +formattedCelcius);

        double doubleCelcius = Double.valueOf(formattedCelcius); //yukaridaki Stringi tekrar sayisal yaptik
        System.out.println("doubleCel: "+ doubleCelcius);

    }
}
