package daily_videos.day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum = 0;

        for (int i = 0; i < total ; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

         //System.out.println(Arrays.toString(numbers));

        double average = sum /(double) total;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Number: "+ Arrays.toString(numbers));
        System.out.println("sum: " + sum);
        System.out.println("average: " + average); //burda sayinin tumunu yaziyor
        System.out.println("average: " + df.format(average)); //burdaysa belirlemis oldugum 0.00 da ki ondalik kismin ilk iki rakamini



    }
}
/*5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number

 */