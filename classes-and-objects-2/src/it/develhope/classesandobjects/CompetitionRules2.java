package it.develhope.classesandobjects;

public class CompetitionRules2 {
    private static CompetitionRules2 competitionRules2 = new CompetitionRules2();
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    private CompetitionRules2(){};

    static CompetitionRules2 getInstance(){return competitionRules2;}//if in this case i put public or default(without
    //nothing it's the same because I need in this case to go only in the class in the same package

    void printRules(){
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }
}
