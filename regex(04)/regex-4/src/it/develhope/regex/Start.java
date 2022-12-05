package it.develhope.regex;
public class Start {
    public static void main(String[] args) {
        String string1 = "x3z ? xYz ! R1 && __";

        String string2 = string1.replaceAll("[x-z]|[0-9]","*");

        System.out.println(string2);
    }
}

