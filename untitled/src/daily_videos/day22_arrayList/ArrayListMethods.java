package daily_videos.day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


   //You can add one element at a time with this add method.
        list.add(10); // 0  // System.out.println(list); //[10]
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // 3
       // list.add(5.5); because  it is a double



        System.out.println(list); // [10, 20, 30, 10]
        // System.out.println(list); // in order to print arraylist you do not need any extra methods


        list.add(1,15);//the elements originally started from index one our shift to the right.

        System.out.println(list); // [10, 15, 20, 30, 10]


        list.add(2,25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]

        System.out.println("-------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Muhammed");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size()); // 4
        //if you want to know the total number of elements in the array list from that array list.
        //You can call this a size method.

        System.out.println(studentsList); // [Muhammed, Abdurasul, Abidullah, Tatiana]

        //you want to get the element from array list object, that's the time that you can use the get method.


        System.out.println(studentsList.get(0)); // Muhammed
        // if I want to get the first student's name.I can use get method

        String firstStudent = studentsList.get(0); //if it returns me data then I can also assign it to a variable of string.
        System.out.println(firstStudent); // Muhammed

        System.out.println(studentsList.size()); // 4
        //I can call the size method.It is going to return me the total number of the elements in this array list.

        String lastStudent = studentsList.get (studentsList.size()-1);

        System.out.println(lastStudent); // Tatiana


    }
}
