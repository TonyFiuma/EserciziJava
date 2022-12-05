package it.develhope.annotations;

public
class Greetings{

    /**
     * method that print a String with annotation and the name who's written
     */
    @DevAnnotation(devName = "John",devSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Welcome!");
    }

    /**
     * method that print a String with annotation and the name who's written
     */
    @DevAnnotation ( devName = "Mark", devSurname = "Brown" )
    public void sayGoodbye(){
        System.out.println("Goodbye!");
    }

}
