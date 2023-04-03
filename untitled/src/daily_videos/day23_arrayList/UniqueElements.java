package daily_videos.day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); // 2
        names.add("Sumeye"); // 3
        names.add("Ali");    // 4
        names.add("Sumeye"); // 5
        names.add("Shukir"); // 6
        names.add("Marika"); // 7
        names.add("Marika"); // 8

/*
First of all I need to access every single names of this array list
 So the easiest way to access it is by using foreach loop to get each other  for loop
  I'm going to do is I will create this condition
  first time that this name has appeared, has occurred.
  The last time that this name has appeared has occurred in this array list
  If the element first time has appeared in our list is also the last time that the element has appeared in the relist
  So that's what makes the element unique.
  First time appear is also the last time that the element has appeared in the array.
  So if the first occurrence is also the last occurrence, then that element is unique.
 */
        for (String each : names) {

            if ( names.indexOf(each)== names.lastIndexOf(each)){

                System.out.println(each); // ==> Ali and Shukir
                //break;
                /*
                if you want to display the first element that is unique then you could have used the break statement here.
                 */
            }

        }











    }
}
