package daily_videos.day17_customClass;

public class TestDogClass {

    public TestDogClass() {
    }

    public String toString() {
        return "TestDogClass{}";
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.bread = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        Dog dog2 = new Dog();

        dog2.name = "Max";
        dog2.bread = "Husky";
        dog2.gender = 'M';
        dog2.age = 4;
        dog2.size = "Large";
        dog2.color = "Gray";


        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Chow chow", "Medium", 3, "White", 'F');


        Dog dog4 = new Dog();
        dog4.setInfo("Chuck","Bulldog","Small",5,"Black",'F');

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);


        dog3.eat();

        dog2.drink();




    }
}





