package SaimClasses;

import java.util.Scanner;

public class ModifyWord {
    /*
     ModifyWord [indexes, conditional]

     Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters

     if the characters we not the same replace the first charter to be '*' and the last character to be #

     print the results
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String word = "java";// hard coded
        String word = input.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);//last index : str.length()-1
        String  middle = word.substring(1, word.length() - 1);

        if (first == last) { // we use == because we are comparing  char types
            System.out.println(word.substring(1, word.length() - 1));

        } else {
            System.out.println( "*" + middle + "#");
        }
    }
}