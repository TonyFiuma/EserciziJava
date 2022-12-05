package it.develhope.regex;

public class Start {
    public static void main(String[] args) {
        String string1 = "I Like to code near the Lake with my friend Luke";

        String string2 =string1.replaceAll("(L.ke)","BLA");

        System.out.println(string2);

    }
}
