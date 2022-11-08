package practiceAdvanced.practice03;

public class Q02_Ascii_AdiniYaz {
    //Adınızın içerdiği harfleri kullanmadan adınızı yazdıran bir kod yazınız

    public static void main(String[] args) {

        //Isim Ali olsun

        char ch1 = 'B'-1;
        char ch2 = 'm'-1;
        char ch3 = 'j'-1;

        System.out.println("" + ch1 + ch2 + ch3);  //Ali yazar

        System.out.println(""+(char)65+(char)108+(char)105);  //Bu da oluyor, bir arkadasin onerisi, ama kullanisli degil


    }
}
