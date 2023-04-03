package daily_videos.day17_customClass;

  public class HWRK_CarTask {

      public String brand;
      public String model;
      public String color;
      public int year;
      public double price;


      public void setInfo(String brand, String model, String color, int year, double price) {
          this.brand = brand;
          this.model = model;
          this.color = color;
          this.year = year;
          this.price = price;

      }

      public String toString() {
          return "Car{" +
                  "brand='" + brand + '\'' +
                  ", model='" + model + '\'' +
                  ", color='" + color + '\'' +
                  ", year=" + year +
                  ", price=" + price +
                  '}';

      }

      public void drive() {
          System.out.println("Driving" + brand + " " + model);
      }

      public void start() {
          System.out.println(brand + " " + model + " has started.");
      }

      public void stop() {
          System.out.println(brand + " " + model + " has stopped.");

      }

   }





