package it.develhope.constructor;

/**
 * Tester class with main method.
 * @author TonyF
 */
public class Start {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {



    // create 2 students
Student giorgio = new Student("Giorgio");
Student luca = new Student("Luca");

    // create 1 teacher

Teacher vanessa = new Teacher();
    // assign a name to the teacher
vanessa.teacherName = "Vanessa";

  // assign grades to the 2 students
vanessa.assignGrade(giorgio,7);
vanessa.assignGrade(luca,5);
    // print the students details
        giorgio.getStudentDetails();
        luca.getStudentDetails();
}}
        


