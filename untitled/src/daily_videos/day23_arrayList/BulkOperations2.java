package daily_videos.day23_arrayList;

import java.util.ArrayList;

public class BulkOperations2 {
    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);
        System.out.println(list1); // [1, 10, 20, 30, 40, 2, 3]

        list1.addAll(numbers); //

        System.out.println(list1); // [1, 10, 20, 30, 40, 2, 3, 10, 20, 30, 40]





    }
}
