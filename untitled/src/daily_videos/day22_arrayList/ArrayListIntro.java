package daily_videos.day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int[5]; // {0,0,0,0,0}

        array[0] = 10; //{10,0,0,0,0}
        array[1] = 20; //{10,20,0,0,0}
        array[2] = 30; //{10,20,30,0,0}
        array[3] = 40; //{10,20,30,40,0}
        array[4] = 50;//{10,20,30,40,50}

       // array[5] = 50; Array size has to be fixed it.

        System.out.println(Arrays.toString(array));// [10, 20, 30, 40, 50]

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);  // [] ==>  it is just an empty list at this moment.
        System.out.println(list.size());// 0 ==> we  do have zero elements
        //If you call this method size, it is going to tell you how many elements that you have in list


    }
}
