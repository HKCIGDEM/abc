package daily_videos.day20_forEach.TaskSolutions;

public class OddAndEvenNumbersForLoop {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20,31, 407};

         int even = 0;
         int odd = 0;
         int sumEven = 0;
         int sumOdd = 0;

         String evenNum = "";
         String oddNum = "";

        for (int number : numbers) {

            if (number %2 == 0){
                even ++;
                evenNum += number + " ";
                sumEven += number;

            }else {
                odd++;
                oddNum += number + " ";
                sumOdd += number;
            }

        }
        System.out.println("Even number in array: " + evenNum +"\n"+"Numbers of even numbers: " + even+"\n"+"Sum of even numbers: "+ sumEven);
        System.err.println("Odd number in array: " + evenNum +"\n"+"Numbers of odd numbers: " + even+"\n"+"Sum of odd numbers: "+ sumEven);

    }
}
/*
1.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */