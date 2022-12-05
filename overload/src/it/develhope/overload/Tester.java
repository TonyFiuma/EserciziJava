package it.develhope.overload;

/**
 * Tester class with main method.
 *
 * @author TonyF
 */
public class Tester{

    /**
     * Main method from where the Java program starts.
     *
     * @param args for all the parameters from command line
     */
    public static void main(String[] args){

        // create the 5 shapes
        Shape undefined = new Shape();
        Shape circle    = new Shape(10.5);
        Shape square    = new Shape(5,4);
        Shape rectangle = new Shape(4,2,5);
        Shape triangle  = new Shape(3,3,4,6);

        // invoke the getShapeDetails() method for the 5 shapes and assign to respective variables
        undefined.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();
        // inform the user
        System.out.println(undefined.getShapeDetails());
        System.out.println(circle.getShapeDetails());
        System.out.println(square.getShapeDetails());
        System.out.println(rectangle.getShapeDetails());
        System.out.println(triangle.getShapeDetails());

    }
}
