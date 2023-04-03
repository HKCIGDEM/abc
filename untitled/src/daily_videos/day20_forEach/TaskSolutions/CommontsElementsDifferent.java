package daily_videos.day20_forEach.TaskSolutions;

import java.util.Arrays;

public class CommontsElementsDifferent {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,10,5,2,10 };
        int[] arr2 = {4,5,6,7,8,10,10,5,2};


        System.out.println(Arrays.toString(arr2));  // [4, 5, 6, 7, 8, 10, 10, 5, 2]

        String commonInt = "";

        for (int i = 0; i < arr1.length; i++) {
            int a1 = arr1[i];

            for (int j = 0; j < arr2.length; j++) {

                if (a1 == arr2[j] && !commonInt.contains("" + arr2[j])) {
                    commonInt += a1 + " ";

                }

            }
        }

        System.out.println(commonInt);
    }
}
