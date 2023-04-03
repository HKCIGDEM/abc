package daily_videos.day20_forEach.TaskSolutions;

import java.util.Arrays;

public class OursClassUniqueElements {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,5,6,7,8,8,9,10,0,2,45,9,13};

         int count1 = 0;

        for (int number : numbers) {
            int count = 0;

            for (int i : numbers) {
                if (number == i){
                    count++;
                }
            }
            if (count == 1){
               // System.out.println(number + " ");
                count1++;
            }
        }
        int[] uniques = new int[count1];
        int j = 0;

        for (int number : numbers) {
            int count = 0;

            for (int i : numbers) {
                if (number == i){
                    count++;
                }
            }
            if (count == 1){
                uniques[j++] = number;
            }
        }
        System.out.println(Arrays.toString(uniques)); //[1, 3, 4, 6, 7, 10, 0, 45, 13]
    }
}
/*
4. Write a program that can display the unique elements of an array

			MUST use for each loops

 */