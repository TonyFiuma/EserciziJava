package it.develhope.stringhandling;

public class Start{
    public static void main(String[] args){

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor "+
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation "+
                "ullamco laboris nisi ut aliquip "+"ex ea commodo consequat. Duis aute irure dolor in reprehenderit "+
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat "+
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        veryLongString = veryLongString.replaceAll("um","HUM");

        String sub1 = veryLongString.substring(0,207);
        String sub2 = veryLongString.substring(207,448);

        System.out.println(sub1.trim()+sub2.trim());

        System.out.println(sub1.indexOf("est"));//non c'è quindi printa -1
        System.out.println(sub2.indexOf("est"));//posizione 228

    }
}

