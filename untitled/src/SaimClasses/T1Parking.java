package SaimClasses;

public class T1Parking {
    public static void main(String[] args) {

            int time = 8; // lets assume this is always a valid time
            double fee;

            if(time >= 6 && time <= 12){
                fee = 7.50;
            } else { // else if( (time >= 13 && time <= 23) || (time >= 0 && time <= 5))
                fee = 15;
            }
            // I can else because I am already assuming the time will only be between 0 - 23

            System.out.println("Fee for parking is " + fee);
            // ternary solution

        System.out.println("____________________________________");
         int time2 = 15;
         double fee2 = time2 >= 6 && time2 <= 12 ?  7.5 : 15;
        System.out.println( "Fee for parking is: " + fee2);

        // ternary syntax:result = boolean ? 7.5 : 15
        // ?   ====> if
        // :   ====> else

        double fee3 =  time2 >= 6 && time2 <= 12 ? 7.5 :(time >= 13 && time <= 23) || (time >= 0 && time <= 5)?15:-1;
        // -1 is used often for invalid result

        System.out.println(fee3);

    }
}
