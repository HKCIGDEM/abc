package daily_videos.day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
/*	1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
*/
/* ilk yontem bu ! boyle cozdu
        String first = "cYdEo";
        String last = "sCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
           //getting first character of first name + the remaining character of the first name

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ",""); // trim ==>baslangic ve sonlardaki bosluklardan kurtulmak icin kullaniliyor
                                            // ama aralardaki bosluklari ayiklamak icin kullanilmiyor
      //trim(0 & replace() method will make sure that the white spaces & additional spaces between the characters will be removed
        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace(" ",""); //bosluk varsa kapatmak icin  yapiyor" " ==>""
         input.close(); //UNUTMA!!!!!!

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //getting first character of first name + the remaining character of the first name

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);

    }
}
