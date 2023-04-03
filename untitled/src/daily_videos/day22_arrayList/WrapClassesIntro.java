package daily_videos.day22_arrayList;

public class WrapClassesIntro {

    public static void main(String[] args) {

        String str = "Jav";


        int a1 = 10; // primitive
        Integer a2 = 10; // non-primitive

        System.out.println("-----------------------------------------------");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1; // Autoboxing
       //  Long b3 = (long) b1;
       // Double b4 = b1;

        char ch = 'A';

        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;

        Double d2 = d1;

        System.out.println("--------------------------------------------");

        Integer n1 = 20;

        int n2 = n1; // Unboxing
       // long n3 = n1;
       // double n4 = n1;


        Character e1 ='Z';

        char e2 = e1; // Unboxing

       // int e3 = e1;
       // long e4 = e1;


    }
}
