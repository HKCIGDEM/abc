package daily_videos.day8_ternaries_switch_statement;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number = 100;
     /*
      String result = "";
       if (number > 0) {
           result = "Positive";
       }else if(number < 0){
           result = "Negative";
       }else  {
           result = "Zero";
        }
        System.out.println(result);
    */
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println(result);

        System.out.println("_______________________________________________");

        int n = 1;
        /*
        String day = "";
        if (n == 1) {
            day = "Monday";
        } else if (n == 2){
            day = "Tuesday";
        } else if (n == 3){
            day = "Wednesday";
        } else if (n == 4){
            day = "Thursday";
        } else if (n == 5){
            day = "Friday";
        } else if (n == 6){
            day = "Saturday";
        } else {
            day = "Sunday";

            System.out.println(day);
         */


        String day =(n == 1)? "Monday":(n == 2)?"Tuesday" :(n == 3)?"Wednesday" :(n == 4)? "Thursday"
                :(n == 5)?"Friday" : (n == 6)?"Saturday":"Sunday";

        System.out.println(day);

        }
    }
