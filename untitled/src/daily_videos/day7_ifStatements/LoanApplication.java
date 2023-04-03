package daily_videos.day7_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 30000,
                creditScore = 800;
        String  result = "";

        if (salary >= 45000 && creditScore>= 700) {
            result = "You are eligible for the loan.";
        }else {
            result = "You are not eligible for the loan.";
        }
        System.out.println(result);
    }
}
