package practiceAdvanced.practice04;

public class Q07_Variable_ArtirmaAzaltma {
    public static void main(String[] args) {

        int x=20;
        int y=15;

        System.out.println(x++ + ++y);  //20+16=36  x i once 20 olarak alip toplar, sonra artirir. Ama y yi once artirir
        System.out.println(x); //21 olur. post increment ile yukaridaki toplama sonrasi artti

        int z =5;
        int sonuc= ++z + z++ + z++ + --z + z-- +z; //39 olur
                // 6     6     7      7     7   6
        System.out.println("sonuc = " + sonuc);
    }

}
