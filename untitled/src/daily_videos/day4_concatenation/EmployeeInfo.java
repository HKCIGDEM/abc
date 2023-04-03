package daily_videos.day4_concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {
        String  name = "Daniel";
        int age = 28;
        char gender = 'M';
        String company_name = "Google Inc";
        String job_title = "Software Developer";
        int salary = 90_000;

        System.out.println(name+" is "+ age + "years old," +"gender" + " is "+ gender + "." +"\n\t"+name+" works at "
        + company_name +" as a "+ job_title +"."+"\n\t" + name+ " makes $" + salary +" per year." );

    }
}
