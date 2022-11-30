package it.develhope.abstraction;

/**
 * This abstract class represents a Vehicle and one of its methods is abstract
 */
public abstract class Vehicle {

public String type;
public int numberOfWheels;


    /**
     * Method that prints the vehicle's details
     */
    public void showVehicleDetails(){

        System.out.println("Type "+ type + " Number of Wheels "+ numberOfWheels);
    }

    public abstract void showVehicleDetails(String type, int numberOfWheels);

    /**
     * Abstract method that needs to implemented for revealing the vehicle sound
     */
public abstract void doVehicleSound();

}