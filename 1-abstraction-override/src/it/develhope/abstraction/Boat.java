package it.develhope.abstraction;

/**
 * A Boat class is a practical extension of the Vehicle abstraction
 */
public class Boat extends Vehicle {
    private final double maxKnotsSpeed;
    private final int boatKilosWeight;


    @Override
    public void showVehicleDetails(String type, int numberOfWheels){
        super.showVehicleDetails();
    }

    // mandatory override of the abstract method doVehicleSound()
    @Override
    public void doVehicleSound() {
        System.out.println("Booooooooooooo");

    }

    /**
     * Constructor method for Boat
     * @param maxSpeed double representing the maximum Boat speed in knots
     * @param weight an int for the total weight in kilos
     */
    public Boat(double maxSpeed,int weight){
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    /**
     * Method that returns the boat details.
     */
public void getBoatWeightAndSpeed(){
    System.out.println("The weight is " + boatKilosWeight+
            " kg the speed is "+ maxKnotsSpeed + " knots");
}
}
