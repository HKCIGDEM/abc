package daily_videos.day23_arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,12,3,4,5,6,7,8) );

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("------------------------------------------------------------");


        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper") );

        Collections.sort(items);

        System.out.println(items); // [Blueberry, Eggs, Milk, Orange, Paper, Potato, Rice, Strawberry, Tomato]

        System.out.println("------------------------------------------------------------");

        Collections.reverse(items); // last element---> first element

        System.out.println(items); //  [Tomato, Strawberry, Rice, Potato, Paper, Orange, Milk, Eggs, Blueberry]

        System.out.println("------------------------------------------------------------");


        ArrayList<String> students = new ArrayList<>();

        students.addAll( Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal") );

        System.out.println(students);   // [Gadir, Hasan, Abidullah, Bilal]
        Collections.swap( students,0,1);
        System.out.println(students); //   [Hasan, Gadir, Abidullah, Bilal]

        Collections.swap(students,0,students.size()-1 );
        System.out.println(students);  // [Bilal, Gadir, Abidullah, Hasan]









    }
}
