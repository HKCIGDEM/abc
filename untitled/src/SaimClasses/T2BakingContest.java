package SaimClasses;

public class T2BakingContest {
    public static void main(String[] args) {

        double judge1 = 8.5, judge2 = 7.9 , judge3 = 8.3;
        double myScore= judge1+judge2+judge3/ 3;//we divide by 3  because we had 3 scores
        double person1 = 8.5,person2 = 7.9;

        if (myScore > person1 && myScore>person2) {
            System.out.println("Congratulation you earned First place with a score of: " + myScore);
        } else if (myScore < person1 && myScore<person2) {
            System.out.println("Congratulation you earned Third place with a score of: " + myScore);
        }else {
            System.out.println("Congratulation you earned Second place with a score of: " + myScore);

        }
               // BAKMAN LAZIM YARIM KALDI HAMZAYI ALMAYA GITMEM GEREKTI!!!!!!!!!!!
    }

    }


