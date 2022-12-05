package it.eserciziJava.encapsulation;

/*achieve encapsulation for a class Person that has the following attributes:
        name
        surname
        height (a double)
        age
        ask the user to input the values
        then print all the details of the Person
        when printing the height, use just 2 decimal places (e.g. the result could be 5.50)

 */

import java.util.Scanner;

public class Start{
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        Person  user    = new Person();
/**
 * based on the data that user enters,the user object is set
 */
        System.out.println("Hey user write your name");
        user.setName(scanner.nextLine());
        System.out.println("and your surname");
        user.setSurname(scanner.nextLine());
        System.out.println("welcome "+user.getName()+" "+user.getSurname()+" write your height and your age ");
        user.setHeight(scanner.nextDouble());
        user.setAge(scanner.nextInt());
        System.out.println(user);
    }
}
