package SaimClasses;

public class T4ReserveWeek5 {
       /*
    T4Reverse [String, index]

    Create a program that will have a String that is always 5 characters long. Reverse that given String and print the reverse version

    ex:
        input: hello
        output: olleh

        input: javaa
        output: aavaj
     */
       public static void main(String[] args) {

           String  str = "world";
           String reverse = "" + str.charAt(4) +str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
           System.out.println(reverse);

           System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

           int index = str.length() -1; // index = 4 --->3 --->2
           String reverse2 = "" + str.charAt(index--) +str.charAt(index--) + str.charAt(index--) + str.charAt(index--) + str.charAt(index--);
           System.out.println(reverse2);


       }

    }

