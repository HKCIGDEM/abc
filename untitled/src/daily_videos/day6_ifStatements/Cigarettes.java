package daily_videos.day6_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {
    int age = 45;
     if (age>=21 && age<100) {
         System.out.println(" You are eligible to buy cigarettes." );
     }
     if ( age<21 || age >100) {
        System.out.println( "You are not eligible to buy cigarettes.");
   }
    }
}
