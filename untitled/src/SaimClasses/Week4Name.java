package SaimClasses;

import java.util.Locale;
import java.util.Scanner;

public class Week4Name {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "Please enter your first name and last name");
        String name = input.nextLine();//james bond
       name = name.toLowerCase();
        int spaceIndex = name.indexOf(" "); //5
        String  firstName = name.substring(0, spaceIndex);
        String  lastName = name.substring(spaceIndex+1);


       // String  upperFirst = " " + name.substring(0,1).toUpperCase();// " " + name.charAt(0);
        //upperFirst =  name.substring(0,1)
        //upperFirst = upperFirst.toUppercase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String  lastNameChar = lastName.substring(0,1);
        lastNameChar = lastNameChar.toUpperCase();
        lastName =lastNameChar + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));

    }
}
