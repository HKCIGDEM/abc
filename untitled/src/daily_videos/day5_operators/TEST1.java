package daily_videos.day5_operators;

import java.util.Scanner;
public class TEST1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        System.out.println((2017<=vehicleYear )?"Your vehicle is fine, enjoy!"
                :        "Your vehicle needs to be recalled!");
    }
    }

 //System.out.println( (grade == 'A')? "Excellent" :(grade == 'B')? "Greed job" :(grade == 'C')? "Good"
    //     :(grade == 'D')? "Passed" : "Failed");
/*SDET Motors Inc. is recalling all vehicles from model years:
1995-1998,
2001-2002,
2004-2006,
2015-2017
Given the vehicleYear determine if the vehicle is being recalled or not
If the year is from included in the recall year list print: Your vehicle needs to be recalled!

If the year is not one of the recall years print: Your vehicle is fine, enjoy!

Main topics: if statements, primitive variables, operators

Example Flows:
Enter vehicle's year:     Enter vehicle's year:
2018

Your vehicle is fine, enjoy!
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
2002
 */