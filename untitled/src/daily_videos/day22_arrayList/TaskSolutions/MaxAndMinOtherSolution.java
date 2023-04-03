package daily_videos.day22_arrayList.TaskSolutions;

import java.util.ArrayList;

public class MaxAndMinOtherSolution {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = -320000000;
        int min =  320000000;

        for (Integer each : list) {

            if (each > max){
                max = each;

            }
            if (each < min){
                min = each;

            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */




