package daily_videos.day23_arrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5]

        array[0] = 100;

        System.out.println(Arrays.toString(array)); // [100, 2, 3, 4, 5]

        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); //[Eggs, paper Towels, Apples, Cooking oil]

       //  groceriesList[2] "Orange"; // I cannot


        groceriesList.set(2,"Oranges");// if I need to update the element of the arraylist,I have to call the set method.
        System.out.println(groceriesList); // [Eggs, paper Towels, Oranges, Cooking oil]

        groceriesList.add(2,"Chicken");
        System.out.println(groceriesList); // [Eggs, paper Towels, Chicken, Oranges, Cooking oil]


        groceriesList.remove(0);
        System.out.println(groceriesList); // [paper Towels, Chicken, Oranges, Cooking oil]

        groceriesList.remove("paper Towels");
        System.out.println(groceriesList);

        System.out.println("------------------------------------------------------------------------------");

        AbstractList<Integer> numbers = new ArrayList<>();

        numbers.add(10);// 0
        numbers.add(20);// 1
        numbers.add(30);// 2
        numbers.add(40);// 3
        numbers.add(50);// 4
        System.out.println(numbers);// [10, 20, 30, 40, 50]

        // numbers.remove(Integer.valueOf(10));
        /*
      if I want to remove this 20 this object that is in this array list this 20 you have to pass it as a Wrapper glass object.
      what you could do was the easiest way is when you call this remove method in order to pass any primitives as an integer object from the integer wrapper class
      You could have called this value of method.OK, when you call this value of method.
      first of all this value of method at the end,
      It will return you an integer.Integer wrapper glass object.
       if this value of method it could take in, it could take strength then it will return integer.
       So if you have an in primitive that you need to. You need to convert it to the object.
        You could still use this value of method, so whichever the primitive.
         Now I can pass that primitive into this manual method.
         So now this value of my talk it is going to convert this primitive int to the wrapper glass.
         So if primitive is converted to the wrapper glass, it is known as what autoboxing.
        then this wrapper class object will be passed into the remove method, Rapper Gloss is also an object.
        It is going to remove it by object this time.
         */
        boolean r1 =  numbers.remove(Integer.valueOf(10));


        System.out.println(numbers); // [20, 30, 40, 50]

        System.out.println(r1 );

        numbers.clear();
        /*
        if you want to remove all the elements out from the realist.
        If you want to create this list arraylist as an empty list.
        Then you could call the clear method.
        Once you call it, clear method size will be set to zero.
         */
        System.out.println(numbers); // []
        System.out.println(numbers.size()); // 0



        System.out.println("-----------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); // 2
        names.add("Sumeye"); // 3
        names.add("Ali"); // 4
        names.add("Sumeye"); // 5
        System.out.println(names);

        System.out.println( names.indexOf("Vasyl")); // ==> 0
        System.out.println( names.lastIndexOf("Vasyl"));  // ==> 1

        System.out.println( names.lastIndexOf("Sumeye"));  // ==> 5


        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true


        System.out.println("hasMuhtar = " + hasMuhtar); // hasMuhtar = false
        System.out.println("hasAli = " + hasAli); // hasAli = true




    }
}
