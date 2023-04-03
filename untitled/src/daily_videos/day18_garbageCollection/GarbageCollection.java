package daily_videos.day18_garbageCollection;

import daily_videos.day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {



        String  s1 = "Java";
        s1 = null; // "Java" will be eligible  for garbage collection

        System.out.println(s1);

       // System.out.println(s1.toUpperCase());

       // System.out.println(s1.replace(null,"Python")); ==> null'e rererans verdigi muddetce gecerliligi yok!!!

        String a = ""; // boslukta olsa heap te tanimli bir nesne
        String b = null; // hic birsey ifade etmiyor

        System.out.println("-------------------------------------");

        String str1 = "Python";
        str1 ="CYDEO";

        System.out.println(str1);

        System.out.println("--------------------------------");


        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", "Medium", 3, "White", 'F');

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck","Bulldog","Small",5,"Black",'F');

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);

      //  new Dog().finalize(); ==> finalize  demek boz ,yok et demek


    }
}
