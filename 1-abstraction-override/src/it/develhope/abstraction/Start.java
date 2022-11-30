package it.develhope.abstraction;

public class Start {

    public static void main(String[] args) {

    // create a Car object
    Car fiat = new Car("Fiat",4,5,18000);                        // listen to the Car sound
     fiat.doVehicleSound();// show the Vehicle details
fiat.showVehicleDetails();
      Boat cruise = new Boat(20,400000000);// create a Boat object
        cruise.doVehicleSound();// listen to the Boat sound
        cruise.getBoatWeightAndSpeed();          // print the Boat weight and speed

    }

}
