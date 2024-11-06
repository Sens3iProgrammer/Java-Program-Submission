
package baldecanas_scrapbookscanner;
import java.util.*;
public class Baldecanas_ScrapbookScanner {
    
    public static void main(String[] args) {
//        String famousperson;
//        int birthyr;
//        String nationality;
//        String occupation;
//        String noteachieve;
//        int agemajsucs;
//        int awrdswon;
//        int deathyr;
//        double networth;
//        String famousquote;
//        
        Scanner sc = new Scanner(System.in);
        
        //User enter info
        System.out.print("Enter the name of the famous person: ");
        String famousperson = sc.nextLine();
        
        System.out.print("Enter their birthyear: ");
        int birthyr = sc.nextInt();
        
        System.out.print("Enter their nationality: ");
        sc.nextLine();
        String nationality = sc.nextLine();
        
        System.out.print("Enter their primary occupation (e.g, Scientist, Actor, Politician): ");
        String occupation = sc.nextLine();
        
        System.out.print("Enter a notable achievement or contribution: ");
        String noteachieve = sc.nextLine();
        
        System.out.print("Enter the age they achieved their first major success");
        int agemajsuccs = sc.nextInt();
        
        System.out.print("Enter the number of awards they have won: ");
        int awrdswon = sc.nextInt();
        
        System.out.print("Enter the year they passed away (if applicable, otherwise enter 0): ");
        int deathyr = sc.nextInt();
        
        System.out.print("Enter their net worth in millions (if known): ");
        double networth = sc.nextDouble();
        
        System.out.print("Enter one of their famous quotes: ");
        sc.nextLine();
        String famousquote = sc.nextLine();
        
        //OUTPUT
        //        String famousperson;
//        int birthyr;
//        String nationality;
//        String occupation;
//        String noteachieve;
//        int agemajsuccs;
//        int awrdswon;
//        int deathyr;
//        double networth;
//        String famousquote;
//        
        System.out.println("--- Biography Summary ---");
        System.out.println("Name: " + famousperson);
        System.out.println("Birth Year: " + birthyr);
        System.out.println("Nationality: " + nationality);
        System.out.println("Occupation: " + occupation);
        System.out.println("Notable achievement: " + noteachieve);
        System.out.println("Age at First Major Success: " + agemajsuccs);
        System.out.println("Awards won: " + awrdswon);
        System.out.println("Death Year: " + deathyr);
        System.out.println("Net Worth: " + "$" + networth + "million");
        System.out.println("Famous quote: " + famousquote);
        
    }
    
}
