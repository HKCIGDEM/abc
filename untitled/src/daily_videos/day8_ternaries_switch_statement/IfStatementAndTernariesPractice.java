package daily_videos.day8_ternaries_switch_statement;

public class IfStatementAndTernariesPractice {
    public static void main(String[] args) {

        int score = 90;
         String result = "";

         if(score>=0 && score<=100) {

             result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : (score >= 50) ? "E" : "F";
         }else {
             result = "Invalid Score";
         }

        System.out.println(result);

        System.out.println("____________________________________________________________");

        String result2 = (score>=0 && score<=100)?
                (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : (score >= 50) ? "E"
                        : "F"
                :"Invalid Score";

        System.out.println(result2);

    }
}
