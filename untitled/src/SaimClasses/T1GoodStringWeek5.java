package SaimClasses;

public class T1GoodStringWeek5 {
    public static void main(String[] args) {

        String str = "gooddday";

        // approach 1
        String posOne = str.substring(1);// gives the String  without the first character
        String posTwo = str.substring(2);// given the String  without the first two character
        System.out.println(posOne.startsWith("good") || posTwo.startsWith("good"));

        // approach 2
        int index =str.indexOf("good");
        System.out.println(index == 1 || index == 2);







    }
}

