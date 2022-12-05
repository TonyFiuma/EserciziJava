package it.develhope.polymorphism;

public class Start{
    public static void main(String[] args){

        Animal lion = new Animal("Lion");
        System.out.println(lion.animalSound());
        System.out.println(lion.animalSound("low"));
    }
}
