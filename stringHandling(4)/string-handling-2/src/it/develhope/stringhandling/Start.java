package it.develhope.stringhandling;

public class Start{
    public static void main(String[] args){

        String string1 = "United Kingdom";
        String string2 = "Germany";
        String sub1    = string1.substring(0,7);
        String sub2    = string1.substring(6,14);
        // concatenate the strings, then convert them to uppercase and finally transform into a char[]
        char charArray[] = sub1.concat(string2).concat(sub2).toUpperCase().toCharArray();
        System.out.println(charArray);

    }
}