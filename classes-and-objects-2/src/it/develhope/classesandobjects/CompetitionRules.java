package it.develhope.classesandobjects;

// singleton class
public class CompetitionRules {
    private static CompetitionRules instance;
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 ="Learn every day!";
    private String competitionRule3 = "Be the best team!";

    private CompetitionRules(){
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }

    public static CompetitionRules getInstance() {
        if(instance== null)
            instance = new CompetitionRules();
        return instance;
    }
}


