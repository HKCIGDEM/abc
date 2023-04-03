package daily_videos.day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);  //  [1, 1, 2, 3, 3, 3, 4, 5, 5, 6]


        for (Integer element : list) {
                 /*
        you use the for each loop you should always double-check
        If it is going to make any altering to the indexes of this array list, then you shouldn't be using foreach
        because in the foreach loop you do not have access to index number, you have access to the element itself.
                  */
            int frequency = 0;
            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                /*
                if condition that I can create if the element that I want to find.
                 I want to find the frequency of if it is matching worse each element of the list.
                 Those are elements of the list are going to make this condition true because they are matching with this given element.
                */
                }

            }

            if (frequency == 1) {
                System.out.println(element);
                break; // exiting the loop, in order to return the first element ONLY
              /*
      So once you give this break statement once this condition is true
      it is going to print the element that is unit after printing element that is unique then it is going to exit the loop.
       Once it exits the loop then the next unique elements will not be printed.
      */
            }
        }
    }

}

/*
 2. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2

 */