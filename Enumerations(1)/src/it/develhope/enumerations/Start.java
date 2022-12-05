package it.develhope.enumerations;

public class Start {
    public static void main (String[] args) {
        for (MonthsEnum months : MonthsEnum.values ()) {
            if (months.toString ().endsWith ("Y")) {
                System.out.println (months + " ends with y");
            } else {
                System.out.println (months + " doesn't end with y");
            }
        }
    }
}
