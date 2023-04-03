package daily_videos.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); // 2
        names.add("Sumeye"); // 3
        names.add("Ali"); // 4
        names.add("Sumeye"); // 5
        // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]



        ArrayList<String> nonDup = new ArrayList<>();


        for (String each : names) {

            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

     // [Vasyl, Sumeye, Ali]

        names = nonDup;

        System.out.println(nonDup);

        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);


        System.out.println(list1); // [10]
        System.out.println(list2);// [10]


        System.out.println(list1 == list2); // true


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();


        l1.add(10);
        l2.add(10);

        System.out.println(l1); // [10]
        System.out.println(l2); // [10]

        System.out.println(l1 == l2); // false
        System.out.println(list1.equals(l2)); // true

        System.out.println("---------------------------------------------------");


        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);


        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // false, they are not in the same order.


        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty()); // true


    }
}
