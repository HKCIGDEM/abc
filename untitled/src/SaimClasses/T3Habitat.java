package SaimClasses;

public class T3Habitat {
    public static void main(String[] args) {

        String habitat = "rainforest",animals = "";

        switch (habitat){

            case "grassland":animals = "goats,bison,badgers,coyotes";break;
            case "jungle":
                animals ="snake,tiger,gorilla";break;
            case "city":
                animals = " dogs,cat birt";
                break;
            case "safari":
                animals ="lion hippo giraffe";
                break;
            default:
                System.out.println( "No  data for "+ habitat);

        }
        System.out.println( "in the " + habitat+" you will able to find: "+ animals);
    }

}
               /*public class T3Habitat {
    /*
    T3Habitat [switch, variables]

    Create a program that will define a String variable of the habitat you want information on. We should get back information about the animals that can be found in those habitats

    use the following data and make creative messages for the outputs
        habitat - animals
        grasslands - goats, bison, badgers, coyotes
        jungle    - snakes, tigers, gorillas, rhinos, toucans
        city    - dogs, cats, gulls, squirrels
        safari - lion, hippo, giraffe, zebras, elephants

        Ex:
            input:
                jungle
            output:
                In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
     */
