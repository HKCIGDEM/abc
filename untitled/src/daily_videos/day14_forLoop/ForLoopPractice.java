package daily_videos.day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 10; i >= 5; i--){ //i: 10, 9, 8, 7, 6, 5.
            System.out.println("Hello Cydeo");// 1, 2, 3, 4, 5, 6.

        }

        // System.out.println("Hello World");

        System.out.println("______________________________________");

        // sum of all the number 1 ~ 100 (asagida bunu cozuyor)

        int sum = 0;

        for(int i =1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-------------------------------");

     // print all the alphabet letters A ~ Z

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " "); // EGER "ln" i cekerse yan yana yazdiriyor
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

        //print all the alphabet letters in backwards Z ~ A

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Cydeo");


    }
}
