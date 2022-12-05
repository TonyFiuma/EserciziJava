package it.develhope.overload;

/**
 * Class that define a shape.
 * There are different shapes according to different constructors.
 *
 * @author TonyF
 */
public class Shape{

    private final String shapeName;
    private int numberOfEdges;

    /**
     * Basic constructor method for creating an undefined Shape
     */
    public Shape(){
        System.out.println("---Another shape object has been created and it was call Undefined---");
        this.shapeName = "Undefined shape";
    }

    /**
     * Constructor method for creating a circle
     *
     * @param radius a double representing the circle's radius
     */
    public Shape(double radius){
        System.out.println("You have just created a circle with radius "+radius);
        this.shapeName = "Circle";
    }

    /**
     * Constructor method for creating a square
     *
     * @param edges      the number of edges
     * @param edgeLength the length of the edge
     */
    public Shape(int edges,double edgeLength){
        System.out.println("You have just created a square with edge length equal to "+edgeLength);
        this.numberOfEdges = edges;
        this.shapeName = "Square";
    }

    /**
     * Constructor method for creating a rectangle
     *
     * @param edges the number of edges
     * @param e1    double length of the first edge
     * @param e2    double length of the second edge
     */
    public Shape(int edges,double e1,double e2){
        System.out.println("You have just created a rectangle with edges e1="+e1+" and e2="+e2);
        this.numberOfEdges = edges;
        this.shapeName = "Rectangle";
    }

    /**
     * Constructor method for creating a triangle
     *
     * @param edges the number of edges
     * @param e1    double length of the first edge
     * @param e2    double length of the second edge
     * @param e3    double length of the third edge
     */
    public Shape(int edges,double e1,double e2,double e3){
        System.out.println("You have just created a triangle that has the following edges lengths: "+e1+", "+e2+" and "+e3);
        this.numberOfEdges = edges;
        this.shapeName = "Triangle";
    }


    /**
     * Method for getting the shape details.
     *
     * @return an informative String containing the shapeName and the numberOfEdges
     */
    public String getShapeDetails(){
        return "The shape "+this.shapeName+" and the edges are: "+this.numberOfEdges;
    }

}
