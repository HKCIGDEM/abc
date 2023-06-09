package daily_videos.day23_arrayList.TaskSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        Collections.sort(list);
        System.out.println(list); // [0, 0, 0, 0, 1, 2, 3, 4]


        int count = Collections.frequency(list,0);


        list.removeAll(Arrays.asList(0));
        System.out.println(list);       // [1, 2, 3, 4]

        for (int i = 0; i < count; i++) {
            list.add(0);

        }
        System.out.println(list);     // [1, 2, 3, 4, 0, 0, 0, 0]


    }
}
/*
5. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */