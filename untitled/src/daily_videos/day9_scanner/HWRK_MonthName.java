package daily_videos.day9_scanner;

import java.util.Scanner;

public class HWRK_MonthName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number:  ");
        int number = input.nextInt();

        String day = "Invalid";

        if (number >= 1 && number <= 12) {

            day = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                    :(number == 5) ? "May" : (number == 6) ? "June" :(number == 7)? "July":(number == 8)?"August"
                    :(number == 9)?"September":(number == 10)?"October":(number == 11)?"November":"December";

        }
        System.out.println(day);

        input.close();

        /*
        if (number >= 1 && number <= 12) { //12 possible outcomes

            if (number == 1) month = "January";

            else if (number == 2) month = "February";
            else if (number == 3) month = "March";
            else if (number == 4) month = "April";
            else if (number == 5) month = "May";
            else if (number == 6) month = "June";
            else if (number == 7) month = "July";
            else if (number == 8) month = "August";
            else if (number == 9) month = "September";
            else if (number == 10) month = "October";
            else if (number == 11) month = "November";
            else  month = "December";

        } else month = ("No such a month");

        System.out.println(month);
       */
    }
}
