package it.develhope.polymorphism;

public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    /**
     * a method that prints a String
     */
    public void animalSound(){
        System.out.println("default animal sound");
    }
}
