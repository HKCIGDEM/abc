package daily_videos.day22_arrayList.TaskSolutions;

import java.util.ArrayList;

public class MaxAndMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if (element > i){
                max = element;
            }
            if (element < i){
                min = element;
            }

        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

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



