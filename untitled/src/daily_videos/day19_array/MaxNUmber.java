package daily_videos.day19_array;

public class MaxNUmber {
    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // 500 (assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) {// i: 1, 2, 3, 4,5
            // burda int i =1 dedik cunku yukarda indexin ilk.num.olan sifiri en buyuk varsaydik
            //bu varsayim uzerinden gitti

            if (numbers[i] > max ){ // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }
        }

        System.out.println("max = " + max);

    }
}
