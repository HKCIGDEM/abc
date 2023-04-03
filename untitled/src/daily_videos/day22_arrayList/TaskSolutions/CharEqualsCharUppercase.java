package daily_videos.day22_arrayList.TaskSolutions;

public class CharEqualsCharUppercase {
    public static void main(String[] args) {

        String str = "JAVA java";

        int[] count = new int[2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)){
                count[0]++;

            } else if (Character.isLowerCase(ch)){
                count[1]++;

            }
        }

        if (count[0] == count[1]){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
}


/*
2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */


