package it.develhope.stringhandling;

public class Start{
    public static void main(String[] args){

        String array1[] = new String[] { " I want "," to learn "," how to code! " };
        char[] array2   = array1.toString().trim().toCharArray();

        // the following line of code can be done in a more efficient way with a loop/iteration
        System.out.println(!( array2.toString().indexOf("I want")
                > array2.toString().compareToIgnoreCase("I learn") ));
    }
}

