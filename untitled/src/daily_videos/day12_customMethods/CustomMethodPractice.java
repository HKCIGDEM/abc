package daily_videos.day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {
        maxNum(10.5, 2.5);
        System.out.println("---------------------------------");

        maxNum(15000, 16000);
        System.out.println("---------------------------------");

        maxNum(-200, -20);
        System.out.println("----------------------------------");

        initial("Eymen","Hamza");

        System.out.println("----------------------------------");

        initial("Hasan","Ayhan");//H.A




    }

    //create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal",(num1,num2)
    public static void maxNum(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");

        } else {
            System.out.println("Equal");
        }

    }


    //create a method than can display the initials of a person (firstName, lastName)==>C.S gibi
    public static void initial(String firstName, String lastName){// int age, char gender, String hairColor, String address) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial is: " + initial);


    }

}
// create a method that can check if a person is eligible to buy alcohol (age)
// create a method that can check if a number is odd, or even,or zero (number
//create a method that can calculate the grade of the students (score)
//create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1,num2)
//create a method than can display the initials of a person (firstName, lastName)

/*  firstname = "Cydeo"
    lastname = "School"

    initial ==> C.S
 */