import java.util.Scanner;

public
class Start{
    /*Exercise: Encapsulation 1
  achieve encapsulation using getters/setters and without using Lombok for a class House that has the following instance variables:
  an int floorsNumber
  a string address
  an array of strings residentsNames
  use a tester class to:
  set the values by asking the user to input them
for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
  prints the house details using the getters and String.format()
  */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        House   house   = new House();
        System.out.println("Hey user write the floor's number");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Hey user write the address");
        house.setAddress(scanner.nextLine());
        System.out.println("Hey user write the names of the residents");
        String person      = scanner.nextLine();
        String residents[] = person.split(",");
        house.setResidentsName(residents);


        String houses = String.format("The house details are number of floors: %d "+"address: %s "+
                                      "The resident's names %s",house.getFloorsNumber(),house.getAddress()
                                      ,house.getResidentsName());
        System.out.println(houses);
    }
}
