package daily_videos.day6_ifStatements;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {
        int age = 28;

        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age < 21) {
            System.out.println("Not Eligibel");
        }
        System.out.println("---------------------------");
        if (age >= 21) {
            System.out.println("Eligible");
        } else {//otherwise
            System.out.println("Not Eligible");
        }
    }

    }
