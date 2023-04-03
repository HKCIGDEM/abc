package daily_videos.day22_arrayList.TaskSolutions;

public class LettersDigitsSpecialsCharactersOtherSolutions {
    public static void main(String[] args) {


        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialCharacters = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            }else {
                specialCharacters  += ch;
            }
        }

        System.out.println("letters = \"" + letters +"\"");
        System.out.println("digits = \"" + digits +"\"");
        System.out.println("special characters  = \"" + specialCharacters +"\"");

    }
}
/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */



