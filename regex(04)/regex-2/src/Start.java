public class Start {
    public static void main(String[] args) {

        String string1 ="tup tuup tuuup tuuuup";

        String string2 =string1.replaceAll("[u]{2,3}","x");
        System.out.println(string2);

    }
}
