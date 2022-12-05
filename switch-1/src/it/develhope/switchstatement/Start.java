package it.develhope.switchstatement;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put one Number from 1 to 10");
        int number = scanner.nextInt();

while (true){
        switch (number){
            case 1:
                System.out.println("one");
                break;
                case 2:
                System.out.println("two");
                break;
                case 3:
                System.out.println("three");
                break;
                case 4:
                System.out.println("four");
                break;
                case 5:
                System.out.println("five");
                break;
                case 6:
                System.out.println("six");
                break;
                case 7:
                System.out.println("seven");
                break;
                case 8:
                System.out.println("eight");
                break;
                case 9:
                System.out.println("nine");
                break;
                case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Cannot give you the name");
                }
                System.out.println("Put one Number from 1 to 10");
                number= scanner.nextInt();}
    }
}
