package day07_stringmanipulations;

public class C_03StringManinulationsReplace {


        /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */

        public static void main(String[] args) {


            //rakam haricindekileri silin

            String str1 = "$45,99";
            str1 = str1.replaceAll("\\D", "");
            System.out.println(str1);   //4599


            // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin

        String cumle= "Her dert java gibi olsa";
        String cumle2 = cumle.replaceAll("\\w", "*");
            System.out.println(cumle2+cumle.substring(10));  //*** **** **** **** ****ava gibi olsa

            //a harfini @ isareti ile degistir
            String ders="olaganustu";

            ders = ders.replaceAll("a", "@");
            System.out.println(ders); //ol@g@nustu




            /** ReplaceFirst
             * Replace ile aynı sadece ilk bulunan karakteri değiştirir
             */

            //txt'deki ilk bulunan 'a' yi 'e' ile degistirin
            String txt = "Merhaba Dunya";

            String txt2 = txt.replaceFirst("a", "e");
            System.out.println(txt2); //Merheba Dunya



            //txt'deki butun 'a' lari 'e' ile degistirin

            txt= txt.replaceAll("a", "e");
            System.out.println(txt);  //Merhebe Dunye



             /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
            //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
            String str="Dolma Kalem";
            str = str.replace("Kalem", "Biber");
            System.out.println(str);  //Dolma Biber



          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

            String str3 = "Merhaba";
            String st = "Merhaba";

            boolean birebirEsitMi = str3.equals("Merhaba");
            System.out.println(birebirEsitMi);  //true

            System.out.println(str3.equals(st));   //true
            System.out.println(str3.equalsIgnoreCase("MerHaBa")); //true
            System.out.println(str3.equals("merhaba")); //false

        }
    }

