package daily_videos.day6_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {
       int number = 100;

     boolean isEven = number % 2 == 0;
     boolean isOdd = !isEven;
        System.out.println(number + " is an even number: " + isEven );
        System.out.println( number + " is an odd number: " + isOdd     );

    }

}
