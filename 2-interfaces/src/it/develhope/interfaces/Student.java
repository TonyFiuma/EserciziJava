package it.develhope.interfaces;

/**
 * A Professor class is a CollegePerson and implements a LearningPerson interface
 */
public class Student extends CollegePerson implements ILearningPerson {

    public int academicYear;


    // necessary override of the interface's abstract method
    @Override
    public void studyAtHome() {
        System.out.println("I'm a student " + academicYear);
    }


    /**
     * Constructor method for Student
     * @param name a String for the Student name
     * @param surname a String for the Student surname
     * @param id an int for the Student identifier
     * @param year an int for the academic year
     */
     void Student(String name,String surname, int id,int year){
         this.name = name;this.surname = surname;
         this.collegeId = id; this.academicYear = year;

     }



}