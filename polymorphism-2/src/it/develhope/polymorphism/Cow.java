package it.develhope.polymorphism;

public class Cow extends Animal{
    public Cow(String animalName) {
        super(animalName);
    }

    /**
     * Override of the method in the mother class with the voice of this class
     */
    @Override
    public void animalSound() {
        System.out.println("Muuuuuuuuuuu");
    }
}
