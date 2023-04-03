package daily_videos.day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {


        int[] arr1 = new int[100];

        /*
        System.out.println("arr1 = " + arr1); // eger bunu yazdirirsam hash cod veriyor.yani gormuyorum

        System.out.println("-----------------------------------------------------------");
         */

        /*
        for (int i = 0, j = 1; i < arr1.length; i++, j++) { //i:index number demek, ama atadigim j:herbir index number a atamak istedigim elemanlar
            arr1[i] = j;
        }
        */

     /*
        for (int i = 0 , j = 10; i < arr1.length; i++, j +=10) { // bu deneme de her 10 index num.den sonra bir j ata demek
            arr1[i]  = j;
        }
        */

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("---------------------------------------------------");

        int[] arr2 = new int[100]; // index: 0 ~ 99

        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }


 /*
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 -i;  // eger ikinci atama yapmadan nasil yaparim dersem
        }
  */

        System.out.println("arr2 = " + Arrays.toString(arr2));



    }
}
