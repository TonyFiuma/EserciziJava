package it.develhope.interfaces;

public class Test {

    public static void main(String[] args) {
        // create the 3 different objects
     Student giulio = new Student();
     giulio.Student("Giulio","Giorgi",123,4);
     Professor marco = new Professor();
     marco.Professor("Marco","Guglielmi",002,"Professor");
     Assistant franco = new Assistant();
     franco.Assistant("Franco","Bianchi",020,true);

        // invoke the goToCollege() method on the 3 object
        giulio.goToCollege();
        marco.goToCollege();
        franco.goToCollege();
        // invoke the implemented methods from interfaces
        giulio.studyAtHome();
        marco.teachToOtherPeople();
        franco.studyAtHome();
        franco.teachToOtherPeople();


}}
