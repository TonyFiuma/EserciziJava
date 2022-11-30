package it.develhope.classesandobjects;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer user1 = new Programmer();
        user1.name = "Gigi";
        user1.age = 25;
        user1.wearsGlasses = true;

        Programmer user2 = new Programmer();
        user2.name = "Alessia";
        user2.age = 28;
        user2.wearsGlasses = false;

        user1.drinkCoffe();
        user1.printDetails();

        user2.printDetails();
        user2.hasGlasses();

    }





}
