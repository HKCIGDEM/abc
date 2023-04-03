package daily_videos.day5_operators;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        System.out.println("Enter third number:");
        int number3 = input.nextInt();

        if(number1 > number2 && number2 > number3) {
            System.out.println("middle number is: " + number2);
        } else if (number3 > number2 && number2 > number1) {
            System.out.println("middle number is: "+ number2);
        }else if (number2 > number1 && number1 > number3) {
            System.out.println("middle number is: " + number1);
        }else if (number3 > number1 && number1 > number3){
            System.out.println("middle number is: "+ number1);

        }else if (number2 > number3 && number3 > number1) {
            System.out.println("middle number is: " + number3);
        }else{
            System.out.println("middle number is: " + number3);

        }


    }
}
