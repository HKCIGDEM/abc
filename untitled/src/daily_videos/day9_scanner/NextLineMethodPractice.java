package daily_videos.day9_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//EnterEnter

        System.out.println("Enter your full name:");// Aaron King Daniel + Enter
        String full_name = input.nextLine();

        System.out.println("Enter your school name");
        String school_name = input.nextLine();//Cydeo School + enter


        System.out.println("Enter your gander: ");
        String gander = input.next();//Male+Enter

        System.out.println("Enter your age: ");

        int age = input.nextInt();// 28+Enter //iki nextLine arasina asagidaki gibi bir ara vermesi gerekiyor ikisini ayirmak icin

        input.nextLine();//Clear out the scanner
        //We have to give extra nextLine() method if we are using a nextLine() method after the other method of scanner

        System.out.println("Enter the street name: ");
        String street = input.nextLine();

        input.close();
    }
}
