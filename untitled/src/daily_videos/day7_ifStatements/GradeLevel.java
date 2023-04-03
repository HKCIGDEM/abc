package daily_videos.day7_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
       int gradeLevel = 6;// 1 ~ 18

       String result = " ";

        if (gradeLevel <= 5){ //false: gradeLevel >= 6
            result ="Elementary School";

        }else if (gradeLevel <= 8) { // false: gradeLevel >= 9
            result = "Middel Scholl";
        }else if (gradeLevel <= 12) { // false: gradeLevel >= 13
            result = "High Scholl";
        }else if (gradeLevel <= 16){ // false: gradeLevel >= 17
            result = "College";
        }else
                  result = "Grad Level";
        System.out.println(result);
    }

}
