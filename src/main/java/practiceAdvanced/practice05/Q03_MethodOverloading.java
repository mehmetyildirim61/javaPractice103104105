package practiceAdvanced.practice05;

public class Q03_MethodOverloading {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Q03_Hacim hacim = new Q03_Hacim();
        double karePrizma=hacim.hacimHesapla(5,6);
        System.out.println("karePrizma = " + karePrizma);

        double dikdortgenPrizma=hacim.hacimHesapla(5,6,7);
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);
    }



}
