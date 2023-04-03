package daily_videos.day4_concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {
        String name = "Joshua";
        byte hourlyRate = 40;
        byte weeklyHours = 45;
        byte weeks = 52;
        System.out.println("Hello "+ name+","+"your salary is $"+ (hourlyRate*weeklyHours*weeks)+".");
    }
}
