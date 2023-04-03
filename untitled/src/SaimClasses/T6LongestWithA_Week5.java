package SaimClasses;

import java.util.Scanner;

public class T6LongestWithA_Week5 {
    /*
 Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

 ex:
     java
     mouse
     computer

 Output: java

 Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //BURDA println KULLANMADIK O YUZDEN YANINA YAZDIRDIK!!!!!!
        int words = 1;
        System.out.print("Please enter word " + words++ + " ");
        String wordOne = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordTwo = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordThree = input.next();
        System.out.println("Pleas enter the letter you want to search for a");
        String search = input.next();

        String  longest = "";

        if(wordOne.contains("a") && wordOne.length() > longest.length()){
            longest = wordOne;

        }

        if(wordTwo.contains("a") && wordTwo.length() > longest.length()){
            longest = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > longest.length()){
            longest = wordThree;
        }

        if(longest.isEmpty()){
            System.out.println( "None of those words contained a");
        }
        System.out.println("Longest is " +longest);

    }
}





