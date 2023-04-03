package daily_videos.day17_customClass;

public class Dog {

    public String name; //instance variable
    public String bread;
    public String size;
    public char gender;

    public int age;
    public String color;

                        //"Max"       "Husky"         "small"     4,        "White"      "F"
    public void setInfo(String name, String bread, String size, int age, String color,char gender){
      this.name = name;//this keyword is used for calling the instance variable name
      this.bread = bread;
      this.size = size;
      this.color = color;
      this.age = age;
      this.gender = gender;

    }//this method can help us to set all the information of the dog at once
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");

    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
