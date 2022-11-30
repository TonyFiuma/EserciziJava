package it.develhope.interfaces;

/**
 * A Professor class is a CollegePerson and implements a TeachingPerson interface
 */
public class Professor extends CollegePerson implements ITeachingPerson {
    // necessary override of the interface's abstract method
    @Override
    public void teachToOtherPeople() {
        System.out.println("I hate teaching and I'm a " + teachingSubject);
    }
    public String teachingSubject;

    /**
     * Constructor method for Professor object
     * @param name a String for the Professor name
     * @param surname a String for the Professor surname
     * @param id an int identifier for the Professor
     * @param subject a String for the Professor subject
     */
public void Professor(String name, String surname, int id, String subject){
   this.name = name;this.surname = surname;
   this.collegeId = id;this.teachingSubject = subject;
}
}