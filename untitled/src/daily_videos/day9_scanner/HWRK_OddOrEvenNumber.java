package daily_videos.day9_scanner;

import java.util.Scanner;

public class HWRK_OddOrEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int number = input.nextInt();

        System.out.println();

        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        if (number % 2 != 0) {
            System.out.println("Odd number");
        }
        input.close();
      }
    }

