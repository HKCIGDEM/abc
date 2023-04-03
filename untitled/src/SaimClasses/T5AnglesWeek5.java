package SaimClasses;
import java.util.Scanner;
public class T5AnglesWeek5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello,please enter 3 angels. Hit enter after each enter");
        int angel1 = input.nextInt();
        int angel2 = input.nextInt();
        int angel3 = input.nextInt();

        int sum = angel1 + angel2 + angel3; // int sum = input.nextInt() + input.nextInt() + input.nextInt();

        if( sum == 180){
            System.out.println("Triangle");
        } else if (sum == 360) {
            System.out.println("Circle");

        }else{
            System.out.println("Cannot determine");
        }

//        int count = 1;
//        System.out.println("Enter angle " + count++);
//        int angle1 = input.nextInt();
//        System.out.println("Enter angle " + count++);
//        int angle2 = input.nextInt();


    }

}
