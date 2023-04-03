package daily_videos.day8_ternaries_switch_statement;

public class FieldTrip {
    public static void main(String[] args) {
      int  grade = 6;

      String locatoin = "Unknown";
      int numOfGroup = 0;
      String teacher = "Unknown";

      if (grade >= 1 && grade <= 6){
          if (grade == 1){
          locatoin =" Apple orchard";
          numOfGroup = 3;
          teacher = "Ms. Smith";

      }else if (grade ==2 ){
              locatoin = "Zoo";
              numOfGroup = 7;
              teacher ="Ms.Lee";
      } else if (grade == 3) {
              locatoin = "Aquarium";
              numOfGroup = 5;
              teacher = "Ms. Wilson";
      } else if (grade == 4) {
              locatoin = "Movie theater";
              numOfGroup = 2;
              teacher = "Ms. Reyes";

      } else if (grade == 5) {
              locatoin = "Museum";
              numOfGroup = 5;
              teacher ="Ms. lela";

      } else //grade == 6
              locatoin = "Six Flags";
              numOfGroup = 8;
              teacher = "Mr. Watt";

      }
          System.out.println("Location - " + locatoin);
          System.out.println("Number of group - " + numOfGroup);
          System.out.println("Teacher in charge - " + teacher);

          }

      }









