package it.eserciziJava.encapsulation;


/*achieve encapsulation for a class Person that has the following attributes:
        name
        surname
        height (a double)
        age
        ask the user to input the values
        then print all the details of the Person
        when printing the height, use just 2 decimal places (e.g. the result could be 5.50)

 */
public class Person {

    private String name;
    private String surname;
    private double height;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{"+
                "name='"+name+'\''+
                ", surname='"+surname+'\''+
                ", height="+height+
                ", age="+age+
                '}';
    }
}
