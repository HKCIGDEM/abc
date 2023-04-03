package daily_videos.day21_multiDimentionalArray.TaskSolutions;

import java.util.Arrays;

public class CydeoSutudents {
    public static void main(String[] args) {

        String[][] batch1Groups = new String[3][];

        batch1Groups[0] = new String[]{"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        batch1Groups[1] = new String[]{"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        batch1Groups[2] = new String[]{"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};


        String[][] batch2Groups = new String[3][];

        batch2Groups[0] = new String[]{"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        batch2Groups[1] = new String[]{"Layla", "Oksana", "Tyler", "Murodil"};
        batch2Groups[2] = new String[]{"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][][] cydeoStudents = {batch1Groups,batch2Groups};

        System.out.println(Arrays.deepToString(cydeoStudents));

        for (String[][] eachBatch : cydeoStudents) {
            for (String[] eachGroup : eachBatch) {
                for (String eachStudent : eachGroup) {
                    System.out.println(eachStudent);



                }
            }
        }

    }
}






