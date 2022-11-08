package practiceAdvanced.practice04;

public class Q06_Static_Butce_Runner {

    //Basit bir ev butcesi kodu yaziniz
    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi: " + Butce.butce);
        baba.maasAl(5000);
        System.out.println("Maas sonrasi butce: " + Butce.butce);

        System.out.println("oncelikli baba harclik: "+baba.harclik);
        baba.harclikAl(500);
        System.out.println("Babanin harcligi: "+baba.harclik);
        System.out.println("Yeni butce: "+Butce.butce);

        baba.harclikHarca(266);
        baba.butcedenHarca(1000);

        System.out.println("Son butce: "+Butce.butce);
        System.out.println("Baba Harclik son durum: "+baba.harclik);

        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);
        anne.harclikHarca(300);

        System.out.println("Butce: "+Butce.butce);
        System.out.println("Anne Harclik: "+anne.harclik);



    }
}
