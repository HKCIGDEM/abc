package daily_videos.day9_scanner;

import java.util.Scanner;

public class HWRK_EligibleOrNotEligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age > 21)System.out.println(" You can buy alcohol.");
        else  System.out.println("You can not buy alcohol.");

        System.out.println();

        input.close();

    }
}
