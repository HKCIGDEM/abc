package daily_videos.day20_forEach.TaskSolutions;

public class UniqueElements {
    public static void main(String[] args) {


        int[] numbers = {1, 1, 1, 12, 2, 2, 2, 3, 3, 3, 8, 8, 9};

        //String result = "";

        for (int each1 : numbers) {

            int count = 0;

            for (int each2 : numbers) {

                if (each1 == each2) {
                    count++;
                }
            }
        if (count == 1) {
          System.out.println(each1);
        }

    }
  }
}
/*
4. Write a program that can display the unique elements of an array

			MUST use for each loops
 */
