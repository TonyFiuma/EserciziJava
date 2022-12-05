package it.develhope.ifstatement;


public class Start{
    public static void main(String[] args){

        String mySurname = "Fiumano";

        String c = mySurname.contains("ni") ? "Your surname contains the sequence of letters 'ni'"
                : "Your surname doesn't contain the sequence of letters 'ni'";
        System.out.println(c);

    }
}


