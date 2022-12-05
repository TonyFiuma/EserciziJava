package it.develhope.ifstatement;

public class Start{
    public static void main(String[] args){
        String myName = "Tony";

        if(myName.length() % 2 == 0) System.out.println("myName.length is even");
        else System.out.println("myName.length is odd");

        //With Ternary operator
        String c = myName.length() % 2 == 0 ? "myName.length is even" : "myName.length is odd";
        System.out.println(c);

    }
}
