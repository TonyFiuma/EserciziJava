package it.develhope.classesandobjects;

public class Competition {
    public static void main(String[] args) {
       CompetitionRules.getInstance();
       CompetitionRules2.getInstance().printRules();

      System.out.println("-------------------------");

      Team teamA = new Team();
      teamA.p1.name = "Pasquale";
      teamA.p1.programmingLanguage = "javascript";
      teamA.p1.yearsOfExperience = 10;

      teamA.p2.name = "Gigi";
      teamA.p2.programmingLanguage = "java";
      teamA.p2.yearsOfExperience = 3;

      teamA.teamName = "Tampa";

      Team teamB = new Team();
      teamB.p1.name = "Ciro";
      teamB.p1.programmingLanguage = "android";
      teamB.p1.yearsOfExperience = 7;

      teamB.p2.name = "Alessandro";
      teamB.p2.programmingLanguage = "java";
      teamB.p2.yearsOfExperience = 4;

      teamB.teamName = "New England";


      teamA.printTeamDetails();
      System.out.println("-------------------------");
      teamB.printTeamDetails();






    }


}
