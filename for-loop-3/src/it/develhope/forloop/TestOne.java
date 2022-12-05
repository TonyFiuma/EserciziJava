package it.develhope.forloop;

public class TestOne{
    public static void main(String[] args) {

        String arr[] = new String[]{"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        for(int i= 0;i<arr.length;i+=2){
            System.out.println(arr[i].toUpperCase());
        }
    }

}