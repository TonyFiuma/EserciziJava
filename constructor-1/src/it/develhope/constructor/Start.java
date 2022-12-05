package it.develhope.constructor;

/**
 * Tester class with main method.
 * @author TonyF
 */
public class Start {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {

        // two variables declaration
        House house1;
        House house2;

    // first House object creation and variable assignment
             house1 = new House();
             house1.address = "Via Gianmarco 10";
             house1.numberOfFloors =3;
    // second House object creation and variable assignment
             house2 = new House();
             house2.address = "Via Montemagno 4";
             house2.numberOfFloors = 2;



}}