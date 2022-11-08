package day07_stringmanipulations;

public class C08_StringManipulationsIndexOf {

    public static void main(String[] args) {

        //Verilen stringde bir karakterin tekrarli olup olmadigina bak

        String str = "Javacancandir";
        char ch = 'j';
       if(str.indexOf(ch)==str.lastIndexOf(ch)){
           System.out.println("Stringde " +ch + " harfi tekrarsizdir");
       }else{
           System.out.println("Stringde " +ch + " harfi tekrarlidir");
       }


    }
}
