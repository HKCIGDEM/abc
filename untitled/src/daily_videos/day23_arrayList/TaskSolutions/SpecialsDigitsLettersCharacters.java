package daily_videos.day23_arrayList.TaskSolutions;

import java.util.ArrayList;

public class SpecialsDigitsLettersCharacters {
    public static void main(String[] args) {


        String  str = "ABCD123$%#@&456EFG!";


        ArrayList<Character> specialsChars = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (char each : str.toCharArray()){

            if (Character.isLetter(each)){
                letters.add(each);
            }else if (Character.isDigit(each)){
                digits.add(each);

            }else {
                specialsChars.add(each);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialsChars = " + specialsChars);

    }
}
/*
7. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"
                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */