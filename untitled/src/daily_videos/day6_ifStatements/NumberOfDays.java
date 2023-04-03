package daily_videos.day6_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 10;
        boolean has28Days = n == 2; //if the month number is 2 (Feb), then it has 28 days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = n == 1 || n == 3 || n == 5 || n == 7 || n ==8 || n == 10 || n == 12;

        String  result = "";
        /* boolean has31days = !has28days && !has30Days;
           if the month does not have  28 days and also does not have 30 days, the month has 31 days
        */

        if (has28Days) {

            result ="28 days";
        }
        if (has30Days) {

            result =" 30 days";
        }
        if (has31Days){
            result ="31 days";
        }
        System.out.println( result);
    }
    }
