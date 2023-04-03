package daily_videos.day18_garbageCollection;

public class TestPizzaObject {

    public static void main(String[] args) {


        Pizza pizza1 =new Pizza();

       // pizza1.size = 'L';

        pizza1.setInfo('L',2, 3);

        Pizza pizza2 = new Pizza();

        pizza2.size = 'M';

        pizza2.setInfo('S', 1, 2);


        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("-----------------------------------");
     // eger 20 ser tane siparisim olsaydi nasil hasaplariz?


        double total = 0;// total miktari atamalitim ki asagida hesaplayabileyim

        for (int i = 0; i < 20; i++){

            Pizza small = new Pizza();
            small.setInfo('S',2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('L',3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }

        System.out.println("total = " + total);

    }

}
