package daily_videos.day7_ifStatements;

public class IfStatementWithOutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;
        if (age >= 21) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        System.out.println("_______________________");

        if (age > 21)System.out.println("Eligible");
         else  System.out.println("Not Eligible");

        System.out.println( "_________________________");
        /*
         int itemNumber = 1;
         if (itemNumber == 1){  // eger iki ihtimalden fazlasi varsa suslu parantezli yazmaliyim DIKKAT ET !!!!!
             System.out.println("Eggs");
             System.out.println("Orange");
         }else if (itemNumber == 2) {
             System.out.println("Milk");
             System.out.println("Onion");
         }else {
             System.out.println("Appel");
             System.out.println("Cherry");
     */
         int day = 2;//1~7
        if (day == 1) System.out.println("Manday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
         else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sanday");


      // IF STATEMENT WITHOUT  CURLY BRACES IS NOT A GOOD PRACTICE  ATTENTION!!!!!!!





        }
    }



















