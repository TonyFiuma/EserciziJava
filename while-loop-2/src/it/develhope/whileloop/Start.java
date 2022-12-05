package it.develhope.whileloop;

import java.util.Scanner;

public class Start{
    public static void main(String[] args){
        System.out.println("Please insert a command");
        /**
         * loop will go until the string stop appears
         */
        Scanner scanner = new Scanner(System.in);
        String  command = scanner.nextLine();
        while(!command.equals("stop")){
            System.out.println("Please enter new command");
            command = scanner.nextLine();
        }
    }
}
