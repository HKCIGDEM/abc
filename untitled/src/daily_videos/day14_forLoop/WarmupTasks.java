package daily_videos.day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {

        String str3 = combine("java", "apple");

        System.out.println(str3);

        String  s1 = "" + true; // "true"

        String  s2 = "" +'e'; // "e"

        System.out.println("------------------------------------");

        System.out.println(  sumOf2IntegerNumber(10, 20) );

        System.out.println( sumOf3IntegerNumber(10, 20, 30) );

        System.out.println( sumOf4IntegerNumber(10, 20, 30, 40) );
    }

    public static String combine(String str1, String str2) {
        //one ,         eight
        String result;

   /*
       if(str1.endsWith("" + str2.charAt(0) ) ) { // if the first string ends with the first character of the second character

           result = str1 + str2.substring(1);
       }else {
           result = str1 + str2;


       }
      */

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) { // if the last character in the first string is equal to the first character of the second string
             result = str1 + str2.substring(1);//first character of the second string should be excluded in the concatenation

        }else{
            result = str1 + str2;
        }
        return result;

    }

    public static  int sumOf2IntegerNumber(int n1, int n2){
         return  n1 + n2;

    }

   public  static  int sumOf3IntegerNumber(int n1, int n2, int n3){
                // return  n1 + n2 + n3;
       return sumOf2IntegerNumber(n1,n2) +n3;
   }

   public static int sumOf4IntegerNumber(int n1, int n2, int n3,int n4){
              // return  n1 + n2 + n3 + n4;
        //return  sumOf2IntegerNumber(n1 +n2+n3) + n4;
      // return sumOf2IntegerNumber(n1, n2) +sumOf2IntegerNumber(n3, n4);
       //return sumOf2IntegerNumber( sumOf3IntegerNumber(n1, n2, n3) , n4 );
       return  sumOf3IntegerNumber( sumOf2IntegerNumber(n1, n2) , n3, n4);

   }


}
