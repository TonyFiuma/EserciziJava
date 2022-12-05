package it.develhope.javadoc;

/**
 * Class with many methods that use many operators
 *
 * @author TonyF
 */
public class ArithmeticOperators{
    /**
     * addiction operator
     *
     * @param num1 integer number
     * @param num2 integer number
     * @return the sum of 2 integers
     */
    public int sum(int num1,int num2){
        int number = num1+num2;
        return number;
    }

    /**
     * subtraction operator
     *
     * @param num1 integer number
     * @param num2 integer number
     * @return the subtraction of 2 integers numbers
     */
    public int sub(int num1,int num2){
        int number = num1-num2;
        return number;
    }

    /**
     * multiplication operator
     *
     * @param num1 integer number
     * @param num2 integer number
     * @return the multiplication of 2 integers
     */
    public int mul(int num1,int num2){
        int number = num1 * num2;
        return number;
    }

    /**
     * division operator and get however 2 integer
     *
     * @param num1 integer number
     * @param num2 integer number
     * @return the division of 2 integer
     */
    public int div(int num1,int num2){
        int number = (int) num1 / (int) num2;
        return number;
    }


}
