package daily_videos.day7_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;// 0 ~ 100

        String result = " ";

        if (score >= 90) {//false: score<90
            result += "A";
        } else if (score >= 80 && score < 90) {
            result += "B";
        } else if (score>=70 && score<80) {
            result += "C";
        }else if (score>= 60 && score<70) {
            result += "D";
        }else if (score >= 50 && score<60) {
            result += "E";
        }else if (score>= 45 && score<50){
                 result += "F";
        }
        System.out.println("Your grade is :"+result  );
    }

}
