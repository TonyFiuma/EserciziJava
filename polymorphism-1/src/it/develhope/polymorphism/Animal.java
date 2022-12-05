package it.develhope.polymorphism;

public class Animal{
    private String animalName;

    public Animal(String name){
        this.animalName = name;
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    /**
     * a method that returns the animal's voice
     *
     * @return String Roarr!
     */
    public String animalSound(){
        return "Roarr!";
    }

    /**
     * overload of animal sound with a String as parameter
     *
     * @param intensity that will be evaluated
     * @return a String based on the parameter
     */
    public String animalSound(String intensity){
        if(intensity == "high"){
            return "Roarrrrrrrr!";
        } else if(intensity == "low"){
            return "Roar";
        } else {
            return "Cannot reproduce it";
        }
    }

}
