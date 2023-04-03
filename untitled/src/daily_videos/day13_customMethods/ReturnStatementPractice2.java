package daily_videos.day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7){// cunku bu sayilar disi olmuyor.haftanin disi bir sayi oluyor

            System.err.println("Invalid Number: " + number);
            return; // exit the main method
        }

        System.out.println(( number == 1)?"Monday" :(number == 2)?"Tuesday" :(number == 3)?"Wednesday":(number ==4)?"Tuesday"
                :(number == 5)?"Friday" :(number == 6)?"Saturday" :"Sunday");


    }

}
