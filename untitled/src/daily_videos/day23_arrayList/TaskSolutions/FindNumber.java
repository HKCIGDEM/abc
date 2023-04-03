package daily_videos.day23_arrayList.TaskSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNumber {
    public static void main(String[] args) {

        ArrayList<Integer>  arraylist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        for (int i = 1; i < n; i++) {

            arraylist.removeAll(Arrays.asList(Collections.max(arraylist)));

        }
        System.out.println(Collections.max(arraylist));

    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */