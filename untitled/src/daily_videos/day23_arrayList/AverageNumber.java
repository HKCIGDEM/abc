package daily_videos.day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list); // [20, 30, 40, 50, 60, 70]

        int sum = 0;

        for (Integer each : list){
            sum += each;
        }


        double average = sum / (double)list.size();
        //if I wanted to get the decimal result when I divide the sum by the total number of element.


        System.out.println("average = " + average); //average = 45.0

    }
}
/*
1. Write a program that can find the average number from an arrayList of integers

 */