package it.develhope.datetime;

import java.time.LocalDate;
import java.time.Period;


public class Start {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDate endMouth = LocalDate.of(2022,12,31);
        LocalDate endYear = LocalDate.of(2022,12,31);
        System.out.println(today.compareTo(endMouth));
        System.out.println(Period.between(today,endMouth).getDays());
        System.out.println(Period.between(today,endYear));



    }
}
