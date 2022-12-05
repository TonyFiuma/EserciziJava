package it.develhope.forloop;

public class CustomNumber{
    public int number;

    /**
     * Constructor to have a random number from 1 to 12
     */
    public CustomNumber(){
        this.number = (int) Math.ceil(( Math.random() * Math.max(1,12) ));

    }

    /**
     * method for have the multiplication table of number witch it will take from the constructor
     */
    public void getMultiplicationTable(){
        for (int i = 12 ; i > 0 ; i--){
            System.out.println("The multiplication of "+this.number+" x "+i+" = "+this.number * i);
        }
    }
}


