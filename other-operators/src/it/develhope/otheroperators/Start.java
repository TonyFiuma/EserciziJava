package it.develhope.otheroperators;

public class Start {
    public static void main(String[] args) {
        int a = 15;
        a+= 5;
        a-=4;
        int b =a;
        b++;
        // use the modulus operator to check if there are remainders
        System.out.println("Is it b sn odd number?: " + !(b%2==0));

        int c = b * (b+=1);

        System.out.println("Is it a multiple of 3?: " + (c%3==0));

    }
}


        
