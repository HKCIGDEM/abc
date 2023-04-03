package daily_videos.day22_arrayList;

public class WrapClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str +1); // ==> 201

      // Integer num1 = Integer.parseInt(str); // unboxing

        int num = Integer.parseInt(str);

        System.out.println(num +1); // ==> 21

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2); // ==> 20

        System.out.println("--------------------------------------------------------------------");

        String  s = "20.5";

       double num3 = Double.parseDouble(s);

       Double num4 = Double.valueOf(s);

        System.out.println(num3); // ==> 20.5
        System.out.println(num4); // ==> 20.5


        System.out.println("--------------------------------------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);


        System.out.println(r1); // ==> true
        System.out.println(r2); // ==> true

        System.out.println("--------------------------------------------------------------------");


        char ch1 = '1';
        char chA = 'A';
        char chSpecialChar = '$';



        boolean isDigit1 = Character.isDigit(ch1);//So what does this method do is if the given character is a digit is a digit means on the table. If it is between character zero to character 9, then it's going to turn into otherwise it returns you false.
        boolean isDigitA = Character.isDigit(chA);

        boolean isLetter = Character.isLetter(chA);//This is letter method is going to return true as long as it is a letter.

        boolean isLowerCaseLetter = Character.isLowerCase(chA);//So you return me false for this method because the given character is uppercase

        boolean isUpperCaseLetter = Character.isUpperCase(chA);

        boolean isSpecialChar = !Character.isLetterOrDigit(chSpecialChar);//Character that you give is either ladder or digit.The only time this method is going to return your false is if the given character is special character.
                                                                     // So I can if I just give this exclamation mark.
        System.out.println("isDigit1 =  " + isDigit1);// ch1 ==>true
        System.out.println("isDigitA =  " + isDigitA); // chA ==>false because, 'A' is letter

        System.out.println("isLetter =  " + isLetter );
        System.out.println("IsLowerCaseLetter = " + isLowerCaseLetter);// chA ==> false, IsLowerCaseLetter = false
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);// chA ==> true, isUpperCaseLetter = true

        System.out.println("isSpecialChar = " + isSpecialChar); // chSpecialChar = '$',  isSpecialChar = true


        System.out.println("--------------------------------------------------------------");
    /*
    So from this string we had to get every single digits and once we get the digit as a character we have to convert it to the number.
    Once you have the chair as a character that you get converted to number.
    Once you convert the number than you can add it to the sum.
     */
        String string = "a1b2c3d4e5";

        int sum = 0;
/*
      First you can call the method that can create an array.
      Once the array is returned then you could call the for loop.
      You could call the for each loop to get each character of the string.
 */

        for (char each : string.toCharArray()) {
      /*
    So in this chart array, this is a char array, I do have every single characters of the string.
    So this string will be assigned to this chart variable one by one.
    And now all I have to do is to verify which character is digit.
    So here what I can do is create this if condition and in order to verify if the character is digit I can use the is digit method from the character wrapper class.

 */
            if (Character.isDigit(each)){//.Here's what I can do is create this if condition and in order to verify if the character is digit I can use this digit method from the character wrapper class.
                sum += Integer.parseInt(""+each);// I use this part sync method which can help me to convert this character.
                                                   //After it's converted to string it this parsing method is going to convert that string to a number.
                                                  //Once it is converted to the number than I can add it to the sum.
            }

        }
        System.out.println("sum = " + sum); //sum = 15
                                          // if you print the sum this variable sum.You do have the sum of all the digits from this given string.


    }
}
