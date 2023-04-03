package daily_videos.day22_arrayList.TaskSolutions;

import java.util.ArrayList;

public class CharEqualsCharUppercaseOtherSolutions {
    public static void main(String[] args) {

        String str = "JAVA java";
        boolean length;

        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> lowerCase = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)){
                upperCase.add(ch);

            }
            if (Character.isLowerCase(ch)){
                lowerCase.add(ch);

            }
        }

        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);

        length = upperCase.size() == lowerCase.size();

        System.out.println("length = " + length);


    }
}
/*
2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */