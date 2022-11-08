package day04ifStatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {
        /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle = input.nextLine();

        if(jobTitle.equalsIgnoreCase("qa")){
            System.out.println("is unvaniniz: Quality Analyst");
        }else if(jobTitle.equalsIgnoreCase("dev")){
            System.out.println("is unvaniniz: developper");
        }else if(jobTitle.equalsIgnoreCase("ba")){
            System.out.println("is unvaniniz: Business Analyst");
        }else if(jobTitle.equalsIgnoreCase("pm")){
            System.out.println("is unvaniniz: Project Manager");
        }else
            System.out.println("Gecerli bir is unvani giriniz");
    }
}
