package it.develhope.genericswildcars;

import java.util.ArrayList;

import java.util.List;

public class Start {

    public static void main(String[] args) {
        // double marks coming from Lisa's individual homework
        List<Double> individualMarkListLisa = new ArrayList<>();
        individualMarkListLisa.add(0,6.7);
        individualMarkListLisa.add(1,9.7);

        // int marks coming from Jeremy's projects
        List<Double> individualMarkListJeremy = new ArrayList<>();
        individualMarkListJeremy.add(0,5.8);
        individualMarkListJeremy.add(1,10.0);

        // calculate the marks averages for Lisa and Jeremy
        Student.getAverageMark(individualMarkListLisa);
        Student.getAverageMark(individualMarkListJeremy);

        // create a new List of Student objects and add the 2 Student(s) using the constructor
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(0,new Student("Lisa","Red",8.2));
        listOfStudent.add(1,new Student("Jeremy","Blue",7.9));

        // print in console all the details about the two Student objects
        for (Student student:listOfStudent
             ) {
            System.out.println(student);

        }
        
    }
}
