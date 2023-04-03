package test;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
     //Output ==>  C.N

       Scanner input = new Scanner(System.in);


        String name = "  chuck norris  ";


        name = name.trim().toUpperCase();
        name = name.charAt(0) +"."+ name.charAt(name.lastIndexOf(' ')+1) +".";

        System.out.println(name);


        System.out.println("-------------------------------");




    }

}
 /*      String result=name.trim().toUpperCase();
         String initials=result.substring(0,1)+"."+result.substring(result.indexOf(" ")+1,result.indexOf(" ")+2)+".";

         output = "C.N."
         ikinci cozum!!!
  */
