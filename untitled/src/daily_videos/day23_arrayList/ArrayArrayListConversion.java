package daily_videos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String[]  arr = { "A", "B", "C", "D"};

        ArrayList<String > list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list); // [A, B, C, D]

        System.out.println("-------------------------------------------------------------");

        ArrayList<String > list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray( new String[0]);
        /*
         You should just give String[0]
         Because this already at the end two array method at the end it is going to turn your new array.
   If the size number that you gave here is less than the actual size of the array list, then it is going to resize it.
   it will return you a new array and if this number that you give here is not enough size for this or realist element,
    then it is going to create a new array with the size that is enough to contain all the elements of this area.
         */

       // String[] languages = list2.toArray( new String[list2.size()] );


        System.out.println(Arrays.toString(languages));

        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[]  n = nums.toArray( new Integer[0] );

       // integer[]  n = nums.toArray( new Integer[0] ); not possible became int  is primitive

        System.out.println(Arrays.toString(n));    // [1, 2, 3, 4, 5, 6, 7]
















    }
}
