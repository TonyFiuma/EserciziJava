package it.develhope.ifstatement;

/**
 * Class to define the age of a person
 *
 * @author TonyF
 */

public class Person{
    public int age;

    /**
     * constructor that prints and builds a random number
     */
    public Person(){
        double randNumb = Math.floor(( Math.random() * ( Math.max(5,80)+5 ) ));
        System.out.println((int) randNumb);
        this.age = (int) randNumb; // narrow casting is necessary because Math.floor returns a double
    }

    /**
     * method that uses if for understand at what stage of life the person is
     *
     * @return a string about a stage of life of person
     */
    public String getLifeStage(){
        if(this.age <= 12){
            return "Child";
        } else if(this.age < 19){
            return "Teen";
        } else if(this.age < 59){
            return "Adult";
        } else {
            return "Senior Adult";
        }

    }


}