package it.develhope.whileloop;

public class Start{
    public static void main(String[] args){
        int number1 = 0;
        int number2 = 1;
/**
 * loop while to obtain the firsts 10 Fibonacci's numbers
 */
        while(number1 <= 34){
            int sum = number1+number2;
            number1 = number2;
            number2 = sum;
            System.out.println(number1);
        }
    }
}
