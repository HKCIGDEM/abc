package daily_videos.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
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

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        /*
 when you called us asList method, you can pass as many arguments as you want
 As long as they are the same data type.
  if you pass five elements, then what does addAll method do is it is going to return you a list with those five elements.
   I just added those five elements into this array list at once just by using this adult method.
    Of course,  I  can use  all  bulk operation.
 */

        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );
        System.out.println(scores);

        System.out.println("-----------------------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll( Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal") );
        // ==> [Gadir, Hasan, Abidullah, Bilal]



        students.addAll(2,Arrays.asList("Shukur", "Sumeye","Tatiana") );
        System.out.println(students); // [Gadir, Hasan, Shukur, Sumeye, Tatiana, Abidullah, Bilal]


        System.out.println("-----------------------------------------------");


        Integer [] nums = {1, 2, 3, 4, 5, 6, 7, 8};


        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));


       // l1.addAll( Arrays.asList(nums) );

        System.out.println(l1);   // [1, 2, 3, 4, 5, 6, 7, 8]


        System.out.println("-----------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();

        employeesList.addAll( Arrays.asList("Alena", "Muhtar", "Gadir", "Ali") );

        boolean hasAlina = employeesList.contains("Alena");

        boolean hasAlinaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar","Ali", "Kuzzat") );

        System.out.println("hasAlina = " + hasAlina);
        System.out.println("hasAlinaGadir = " + hasAlinaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);  // false; because Kuzzat doesn't exist.


        System.out.println("-----------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10,20,30,40,50,60,78,10,10,10,10,10,20,20,20,20,20) );


        list.removeAll( Arrays.asList(10,20) );

        System.out.println(list);  //  [30, 40, 50, 60, 78]


        System.out.println("-----------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena") );

        developers.retainAll(Arrays.asList("Alena","Khashayar"));

        System.out.println(developers); // [Alena, Khashayar, Alena]

        /*
        we use retain all method, we are going to specify the elements that we would like to keep.
        And any other elements will be removed.
         */


        System.out.println("-----------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll( Arrays.asList( "Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper") );

        /*
        Suppose that's how your credit card or bank or debit card did not work.
         So you have to pay cash,and you do not have enough money for all those groceries.
         And the essentials that you have to keep are acts potato, milk and tomato.
         Those are the four essentials that you have to have for today.
         Therefore, how can you remove the ones that are not essential?

         */

        groceriesList.retainAll( Arrays.asList( "Tomato" , "Potato", "Milk", "Eggs") );

        // groceriesList.removeAll( Arrays.asList( "Rice", "Orange", "Strawberry", "Blueberry", "Paper") );


        System.out.println("groceriesList = " + groceriesList); // groceriesList = [Eggs, Potato, Milk, Tomato]


    }
}
