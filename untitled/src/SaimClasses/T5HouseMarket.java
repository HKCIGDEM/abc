package SaimClasses;

public class T5HouseMarket {
    public static void main(String[] args) {

        String  name ="Canyon";
        double avgPrice = 0, ratingForSchools = 0;
        boolean isGated = false, allowsPets = false;

        switch (name){

            case "Hills":
                avgPrice = 89_000;
                ratingForSchools = 4.0;
                isGated = false;
                allowsPets = true;
                break;
            case "Oaks":
                avgPrice = 75_000;
                ratingForSchools = 3.5;
                isGated = false;
                allowsPets = true;
                break;
            case "Highland":
                avgPrice = 150_000;
                ratingForSchools = 4.5;
                isGated = true;
                allowsPets = false;
                break;
            case "Canyon":
                avgPrice = 201_000;
                ratingForSchools = 4.8;
                isGated = false;
                allowsPets = true;
                break;
        }

        String report = "The houses in the " + name+ "on average value at $ "+ avgPrice + ". This neighborhood is "+
                (isGated ?  "gated" : "not gated") + " and the rating of the schools distracts near by is "+
                ratingForSchools+ " out  of 5. For  the pet owners "+ (allowsPets ? " you are in luck, pets are allowed" :
                " sorry pets are not allowed.");
        System.out.println(report);

    }
}
