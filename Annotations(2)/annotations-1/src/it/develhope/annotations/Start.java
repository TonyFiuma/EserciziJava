package it.develhope.annotations;

@SuppressWarnings({"unchecked"})
public class Start{


    public static void main(String args[]){

        Car alfa = new Car("Giulietta",100100);
        alfa.printCarDetails();
        System.out.println("--------------------------");
        alfa.getCarDetails();

    }

}
