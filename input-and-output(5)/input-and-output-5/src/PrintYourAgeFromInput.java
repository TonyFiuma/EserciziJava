import java.util.Scanner;

public class PrintYourAgeFromInput{
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = imput.nextInt();
        System.out.printf("Your age is %d ",age);
    }
}
