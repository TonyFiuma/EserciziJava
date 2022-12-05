package it.develhope.polymorphism;

public class Lion extends Animal{
    public Lion(String animalName) {
        super(animalName);
    }

    /**
     * Override of the method in the mother class with the voice of this class
     */
    @Override
    public void animalSound() {
        System.out.println("Roarrrrr!");
    }
}
