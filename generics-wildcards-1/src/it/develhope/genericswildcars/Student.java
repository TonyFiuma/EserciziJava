package it.develhope.genericswildcars;


import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Class to define a student
 *
 * @author TonyF
 */
public class Student{
    private final String studentName;
    private final String studentSurname;
    private final double marksAverage;

    /**
     * Constructor method
     *
     * @param name    a String for the Student's name
     * @param surname a String for the Student's surname
     * @param average a double for the Student's marks average
     */
    public Student(String name,String surname,double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }
    @Override
    public String toString(){
        return "Student{"+
                "studentName='"+studentName+'\''+
                ", studentSurname='"+studentSurname+'\''+
                ", marksAverage="+marksAverage+
                '}';
    }

    /**
     * Static method that takes
     *
     * @param listOfMarks is a List with a lower bound wildcard for Number
     * @return a double value representing the average
     */
    static double getAverageMark(@NotNull List<? extends Number> listOfMarks){
        double average = 0.0;
        for (Number number : listOfMarks){
            average += number.doubleValue() / 2;
        }
        return average;
    }


}
