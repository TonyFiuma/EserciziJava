package it.develhope.interfaces;

/**
 * Generic superclass that describes a person that goes daily to the college.
 */
public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;


    /**
     * Simple method that prints the details of the person going to the college
     */
public void goToCollege(){
    System.out.println(name +" "+ surname +" College Id = "+collegeId);
}
}