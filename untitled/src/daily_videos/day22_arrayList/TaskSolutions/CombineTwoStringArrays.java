package daily_videos.day22_arrayList.TaskSolutions;

import java.util.ArrayList;

public class CombineTwoStringArrays {
    public static void main(String[] args) {


        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
/*
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println("list == " + list);



 */

        ArrayList<String> list = new ArrayList<>();

        for (String each1 : arr1) {
            list.add("\""+each1+"\"");
        }
        for (String each2 : arr2) {
            list.add("\""+each2+"\"");
        }

        System.out.println("list ==> " + list);


    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */


