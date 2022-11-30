package it.develhope.abstraction;

/**
 * A Car class is a practical extension of the Vehicle abstraction
 */
public class Car extends Vehicle{

    public int numberOfDoors;
    public double carPrice;



    // you can choose to override or not the showVehicleDetails() method - in this case there's the override


    @Override
    public void showVehicleDetails(String type, int numberOfWheels) {
    super.showVehicleDetails();
        System.out.println("The number of doors are " + numberOfDoors);
    }

    // you are forced to do this override because doVehicleSound() is an abstract method
    @Override
    public void doVehicleSound() {
        System.out.println("wroooooooom");
    }

    /**
     * Car constructor
     * @param wheels an int representing the number of wheels
     * @param doors an int representing the number of doors
     * @param price a double representing the car's price
     */
    public Car(String type,int wheels,int doors,double price){
     this.type = type;this.numberOfWheels=wheels;
     this.numberOfDoors = doors;this.carPrice = price;
    }


}