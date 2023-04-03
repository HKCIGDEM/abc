package daily_videos.day18_garbageCollection;

public class Pizza {

public char size;//instance variable
public int numberOfCheeseTopping, numberOfPeperoniTopping;//ayni int altinda virgulle ayirarak yazabilirim.sonra ki hesaplamada kolaylik sagliyor!

    //calculates the total price of the pizza, returns it as double
public double calcCost(){ //string kullanmadik cunku tek sefer basmayacagiz
    double totalPrice = 0;

    switch (size){
        case 'S':
        case 's':
            totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPeperoniTopping);
            break;

        case 'M':
        case 'm':
            totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPeperoniTopping);
            break;


        case 'L':
        case 'l':
            totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPeperoniTopping);
            break;


        default:
            System.out.println("Invalid size: " + size); // eger musreri bambaska bir deger girerse gorecegi seyi yaziyoruz boylece.ve yukari tasiyor ve " 0 " goruyor

    }

    return totalPrice;

}


public void setInfo(char size,int numberOfCheeseTopping, int numberOfPeperoniTopping){
    this.size = size;
    this.numberOfCheeseTopping = numberOfCheeseTopping;
    this.numberOfPeperoniTopping = numberOfPeperoniTopping;


}




    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                ", totalPrice=" + calcCost() +
                '}';
    }




}
/*	1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping

 */