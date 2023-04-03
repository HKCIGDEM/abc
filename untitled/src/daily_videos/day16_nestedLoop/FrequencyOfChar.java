package daily_videos.day16_nestedLoop;

public class FrequencyOfChar {
    public static void main(String[] args) {
/* write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5

 */
        String str = "acbacbc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            if (str.charAt(i) == ch) { // if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++;

            }

        }
        System.out.println(count);


    }



}
