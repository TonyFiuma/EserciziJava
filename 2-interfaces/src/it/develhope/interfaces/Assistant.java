package it.develhope.interfaces;

/**
 * The Assistant is a CollegePerson that can teach and learn
 */
public class Assistant extends CollegePerson implements ITeachingPerson,ILearningPerson{


    public boolean isGoingToBedAPhD;

    // mandatory abstract method override
    @Override
    public void studyAtHome() {
        System.out.println("I'm into the teach and I'm going to bed " +isGoingToBedAPhD );

    }
    // mandatory abstract method override
    @Override
    public void teachToOtherPeople() {
        System.out.println("I love to study");
    }

    /**
     * Assistant method constructor
     * @param name a String for the Assistant name
     * @param surname a String for the Assistant surname
     * @param id an int identifier for the Assistant
     * @param willBeAPhD a boolean for the Assistant possible PhD
     */
     public void Assistant(String name, String surname, int id, boolean willBeAPhD){
         this.name = name;this.surname = surname;
         this.collegeId = id;this.isGoingToBedAPhD = willBeAPhD;
     }
}