package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {

    //Bir String degerin palindrome olup olmadigini kontrol eden bir kod yazin

    public static void main(String[] args) {

        String str = "Nazan";

        StringBuilder str2= new StringBuilder(str);

        str2.reverse();

        String str3 = str2.toString();

        if(str.equalsIgnoreCase(str3)){
            System.out.println(str+" palindrome'dur");
        }else{
            System.out.println(str+" palindrome degil");
        }

        //2.Yol: klasik cozum

        String reverseString = "";
        for(int i=str.length()-1; i>-1; i--){
            reverseString+=str.charAt(i);
        }
        System.out.println("reverseString = " + reverseString);
        if(str.equalsIgnoreCase(reverseString)){
            System.out.println(str+" palindrome'dur");
        }else{
            System.out.println(str+" palindrome degil");
        }
        }
    }

