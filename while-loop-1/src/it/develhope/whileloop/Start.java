package it.develhope.whileloop;

public class Start{
    public static void main(String[] args){

        while(true){
            System.out.println("I am in loop");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
