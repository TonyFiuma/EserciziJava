package it.develhope.booleanoperators;

public class Start {
    public static void main(String[] args) {

        boolean a = 2 <- 2 && !true; //false
        boolean b = !false && 3 > 2; //true
        boolean t = false;
        boolean f = true;
        boolean c = !(!t || f);//false
        boolean d = 6 > 6 ^ !(true && true); //false



    }
}