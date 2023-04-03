package daily_videos.day16_nestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3; // uc kez denenmesini istiyorum demek


        do {
            System.out.println("Enter your user name:");
            u = input.next();

            System.out.println("Enter your passport:");
            p = input.next();

            attempt--;

            if (attempt == 0){ // yani 3.-> ,2.-> ,1.-> 0 'a geldiginde dur demek
                break;
            }


        }while ( !(u.equals("Cydeo") && p.equals("WoodenSpoon"))); //while the credentials are invalid





    }
}
