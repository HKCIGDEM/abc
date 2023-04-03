package daily_videos.day20_forEach.TaskSolutions;

public class OursClassCountOfPalindrome {
    public static void main(String[] args) {


        String[] words =   {"anna", "level", "Java","Suus","Izmzi","New York"};

        int count = 0;

        for (String word : words) {

            String reverse = "";

            for (int i = word.length()-1; i >= 0; i--){
                reverse += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverse)){
                count ++;
            }
        }
        System.out.println("Number of palindrome element: " + count);

    }
}
