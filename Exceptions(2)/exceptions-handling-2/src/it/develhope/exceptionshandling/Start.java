package it.develhope.exceptionshandling;

import java.util.Scanner;

public class Start{

    public static void main(String[] args){

        int     a;
        int     b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put dividend and divisor for a division's (int)result");
        System.out.println("Put dividend:");
        a = scanner.nextInt();
        System.out.println("Put divisor:");
        b = scanner.nextInt();
        if(b == 0){
            throw new ArithmeticException("Is impossible to divide by 0");
        }
        System.out.println("The result is: ");
        int c = a / b;
        System.out.println(c);
    }

}
