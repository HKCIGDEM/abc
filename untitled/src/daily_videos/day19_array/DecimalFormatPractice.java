package daily_videos.day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); // 5 den buyukse aktariyordu

        double n1 = 10.587654;


        System.out.println(df.format(n1));
    }
}
