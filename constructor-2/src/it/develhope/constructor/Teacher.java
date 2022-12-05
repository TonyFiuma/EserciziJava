package it.develhope.constructor;

/**
 * Class that defines a teacher
 * @author TonyF
 */
public class Teacher {
    public String teacherName;


    /**
     * Constructor method for creating a new Teacher object
     */
public Teacher(){
    System.out.println("it's born a new teacher Object");
}

    /**
     * A simple method for assigning a grade to a student
     *
     * @param alum a Student object
     */
public void assignGrade(Student alum,int finalGrade){
    alum.grade = finalGrade;
}
}