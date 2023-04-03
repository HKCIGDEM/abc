package daily_videos.day8_ternaries_switch_statement;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 2;



      /*floor1
        floor2
        floor3
       */
/*        if (floorNumber >= 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            } else if (floorNumber == 3) {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        } else {
            //invalid floor
            System.out.println("invalid floor");

        }

 */
          String  result = "Invalid floor";

            if (floorNumber >= 1 && floorNumber <= 3) {
                 result = "Floor" + " is selected. Companies: ";

             if (floorNumber == 1) {
                 result += "Lobby, Verizon, Starbucks";

             } else if (floorNumber == 2) {
                 result += " Cydeo, NASA, Intelsat";

             } else {
                 result += "Lyft, BofA, Stake house";
             }

            }
            System.out.println(result);

/*

            if (floorNumber == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            } else if (floorNumber == 3) {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
*/

        }
     }

