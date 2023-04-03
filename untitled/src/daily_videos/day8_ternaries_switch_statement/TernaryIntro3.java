package daily_videos.day8_ternaries_switch_statement;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int num = 8;//1~~12

        String month = ( num == 1)? "January":  (num == 2)?"February":(num == 3)?"March":(num == 4)?"April"
                :(num== 5)?"May":(num == 6)?"June":(num == 7)?"July":(num == 8)?"August":(num == 9)?"September"
                :(num == 10)? "October":"November";

        System.out.println(month);


        System.out.println("____________________________________________________");
        int n = 5;

        String day =(n >= 1 && n<= 7)?
                (n == 1)?"Monday":(n == 2)?"Tuesday":(n == 3)?"Wednesday":(n == 4)?"Thursday":(n ==5)?"Friday"
                 :(n == 6)?"Saturday" :"Sunday"
                :"No such a day";
        System.out.println(day);

    }
}
