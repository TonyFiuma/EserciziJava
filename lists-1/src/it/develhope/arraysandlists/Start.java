package it.develhope.arraysandlists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test Class
 * TonyF
 */
public class Start{
    public static void main(String[] args){


        // create a not-mutable List
        List<String> cityNames = Arrays.asList("Berlin","Milan","Paris");

        /*
         * The following line of code is commented because it throws an UnsupportedOperationException.
         * An exception is thrown because .add() is not supported method on a not mutable List.
         */
        //cityNames.add("Rome");

        // set is an allowed method on a not mutable List
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);

        // create an empty mutable List
        List<String> kingsOfRome = new ArrayList<>();

        // let's add all the 7 kings of Rome
        kingsOfRome.add(0,"Romolo");
        kingsOfRome.add(1,"Numa Pompilio");
        kingsOfRome.add(2,"Tullo Ostico");
        kingsOfRome.add(3,"Anco Marco");
        kingsOfRome.add(4,"Tarquinio Prisco");
        kingsOfRome.add(5," Servio Tullio");
        kingsOfRome.add(6,"Tarquinio il Superbo");
        System.out.println(kingsOfRome);

        // do the conversion and the type of the array is defined using `new String[0]`
        String kingsOfRomeArray[] = kingsOfRome.toArray(new String[ 0 ]);

// edit the 7th king's value
        kingsOfRomeArray[ 6 ] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));

    }
}
        
