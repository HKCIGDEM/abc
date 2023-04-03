package daily_videos.day14_forLoop;

public class OverloadingTheMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25);//B
        main(20.05);//C
        main(true);//D
    }
    public static void main(int[] args) {
        System.out.println("B");
    }

    public static void main(double args) {
        System.out.println("C");
    }
    public static  void main (boolean args){
        System.out.println("D");

    }

}
