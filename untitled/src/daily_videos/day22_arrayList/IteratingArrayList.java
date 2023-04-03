package daily_videos.day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        // numbers.add(300,255); // I do not have this index number.


        System.out.println(numbers); // [100, 200, 300, 255, 400, 500]

        System.out.println(numbers.get(0));  // 100
        System.out.println(numbers.get(numbers.size() -1)); // 500

        System.out.println("-----------------------------------------------");
        /*
    If I want to aggregate starting from beginning to the end.
    If I need to access the elements starting from beginning to the end.
    First of all, is it possible that I can migrate our realist with the four loop that has the initialization condition and iterator.
         */


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-------------------------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));

        }
        System.out.println("----------------------------------------------------------");
          /*
        I will need index number, then the foreach loop cannot help I and whenever I need to reverse the array list.

         if I just want to access the elements, I do not need to do any altering
         I just want to access the elements from first element to the left.

         But the advantage of Foreach loop is
          I just want to access the elements from first element to the left, then for each loop is
                                                                              the shortest and best solution.
         */

        for (Integer each : numbers) {
            System.out.println(each);

            /*
        Each element in this array is an integer wrapper class.Integer wrapper glass will be assigned to the invariable.
        What is it called when the integer object it wrapper class object is converted to the primitive value?
        It's called well Unboxing.
        But usually it is the best if I keep the data type of this variable as it is with my array lists objects.


            for (int each : numbers) {
                System.out.println(each);

              */

            }


        }

    }


