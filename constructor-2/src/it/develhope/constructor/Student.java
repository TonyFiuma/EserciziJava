package it.develhope.constructor;

/**
 * Class that defines a student
 * @author TonyF
 */
public class Student {

    public String name;
    public int grade;

    /**
     * Constructor method for creating a new Student object
     *
     * @param studentName a String describing the student's name
     */
public Student(String studentName){
    this.name = studentName;
    System.out.println("A new object was born from " + this.name);
}

    /**
     * Method that prints the students details
     */
public void getStudentDetails(){
    System.out.printf("The student %s has %d %n",this.name,this.grade);
}
}