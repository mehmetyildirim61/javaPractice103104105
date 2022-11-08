package day02__variables;

public class C01_Sout {

    public static void main(String[] args) {

        /*
   Soru-1 :Konsolda asagidaki ciktiyi yazdiriniz

  T
  E
  C
  H
  P
  R
  O

  E
  D
  U
  C
  A
  T
  I
  O
  N
   */
       /* System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");*/

    /*
            ONEMLI NOT
    ctrl+alt+l==>sayfayi duzenler
    \n alt satira gecirir
    \t tab bosluk birakir
    \b gerisindeki harfi siler
     \\: :\ (ters slash) yazdirir   prints a back slash
      \': ' tek tirnak yazdirir.  prints single quote
      \" :"" cift tirnak yazdirir. : prints double quote\
     */

            //2.Yol: Şimdi tek satır kodla aynı işi yapalım

        System.out.println("\nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //Java ile Guzel Dunya cümlesinin her kelimesini alt alta yazdıracak kod yazın.

        System.out.println("\nJava\nile\nGuzel\nDunya");
        //Şimdi de Java ile Guzel Dunya cümlesinin her kelimesini yanyana 1 tab boşluk olacak şekilde yazdıracak kod yazın.
        System.out.println("java\tile\tguzel\tdunya");

        //// Soru-4 :java ile guzel dunya  ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.

        System.out.println("java \bile \bguzel \bdunya");
        //Pazartesi kelimesinin her harfini ayrı bir satıra gelecek kod yazın.

        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nI");
        // "Techpro" ile java çok 'kolay yazdıran bir kod

        System.out.println("\"Techpro\" ile java çok \'kolay\'");

        //"MAHARET" hic 'DUSMEMEK' degil;



        //  "Her dustugunde kalkabilmektir" şeklinde yazdırın. (İlk satırla ikincii arasında 3 satır boşluk, 2. satirda tab boşluk başlıyor.

        System.out.println("\"MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\n\t\"Her dustugunde kalkabilmektir\"");

    }

}
