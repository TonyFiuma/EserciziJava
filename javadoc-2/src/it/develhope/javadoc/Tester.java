package it.develhope.javadoc;

/**
 * Class to try javadoc with operator
 *
 * @author TonyF
 */
public class Tester{
    public static void main(String[] args){
        ArithmeticOperators operations = new ArithmeticOperators();
        System.out.println(operations.sum(10,2));
        System.out.println(operations.sub(10,2));
        System.out.println(operations.mul(10,2));
        System.out.println(operations.div(10,3));
    }

}
