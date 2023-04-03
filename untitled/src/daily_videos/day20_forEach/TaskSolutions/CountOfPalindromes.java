package daily_videos.day20_forEach.TaskSolutions;

public class CountOfPalindromes {
    public static void main(String[] args) {

            String[] arr = {"anna", "level", "Java"};
            int count = 0;

            for (String each : arr) {

                String reverse = "";

                for (int i = each.length() - 1; i >= 0; i--) {
                    reverse +=each.charAt(i) ;

                }
                if (reverse.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

/*
3.write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */