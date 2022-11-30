package it.develhope.booleanoperators;


public class Start {
    public static void main(String[] args) {
        boolean a = (55 != 55) && (false ^ true);//false
        boolean aa = true;
        boolean bb = false;
        int cc = 2;
        char dd ='2';
        boolean b = (!aa || !bb) || (cc == dd );//true
        boolean c = false && true || false && !false;//false
        boolean d =  (false && true) || (false || true);//true

    }
}