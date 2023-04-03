package daily_videos.day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50,60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array,array.length + 1);
        // [10, 20, 30, 40, 50,60, 70, 80, 90]

        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("--------------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60]

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60, 50]

        System.out.println("-------------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};
        nums = ArraysUtility.addElement(nums,5.5);

        System.out.println(Arrays.toString(nums)); // [1.5, 2.5, 3.5, 4.5, 5.5]


        nums = ArraysUtility.addElement(nums,6.5);

        nums = ArraysUtility.addElement(nums,7.5);

        nums = ArraysUtility.addElement(nums,8.5);


        System.out.println(Arrays.toString(nums));// [1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5]

        System.out.println("------------------------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArraysUtility.addElement(students, "Umran");

        System.out.println(Arrays.toString(students));// [Yasin, Sumeye, Ermek, Umran]

        students = ArraysUtility.addElement(students, "Muhammed");

        students = ArraysUtility.addElement(students, "Kadir");

        students = ArraysUtility.addElement(students, "Kerim");

        System.out.println(Arrays.toString(students)); //[Yasin, Sumeye, Ermek, Umran, Muhammed, Kadir, Kerim]



    }
}
