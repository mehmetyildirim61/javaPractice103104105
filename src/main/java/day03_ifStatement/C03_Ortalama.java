package day03_ifStatement;

public class C03_Ortalama {

    public static void main(String[] args) {
/*
    double num1 = 23.4;
    double num2 = 24.0;
    double num3 = 12;
    double num4 = 450.3;
    double num5 = 23000;

    bu sayıların ortalamasını bulunuz.
     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double toplam = (num1+num2+num3+num4+num5);
        double ort = toplam/5;
        System.out.println("ortalama = "+ort);

    }


}
