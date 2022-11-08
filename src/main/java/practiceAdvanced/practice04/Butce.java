package practiceAdvanced.practice04;

public class Butce {

   public static int butce;    //static olandan onu kullananlar etkileniyor, non static te kopya olusturuyor, objesiz alinamiyor, otekileri etkilemiyor
   public int harclik;

    public void harclikAl(int alinanHarclik){
        harclik+=alinanHarclik;
        butce-=alinanHarclik;
    }
    public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
    }
    public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
    }
    public void maasAl(int alinanMaas){
        butce+=alinanMaas;
    }
}
