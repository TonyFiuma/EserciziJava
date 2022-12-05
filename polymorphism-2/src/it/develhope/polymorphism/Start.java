package it.develhope.polymorphism;



public class Start {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");
        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
