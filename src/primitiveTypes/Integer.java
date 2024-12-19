package primitiveTypes;
import java.util.Scanner;


public class Integer {
    public static void main(String[] args) {
    // sum of two numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number for sum: ");
        int numberOne = scanner.nextInt();

        System.out.println("enter another number: ");
        int numberTwo = scanner.nextInt();

        int result = numberOne + numberTwo;

        System.out.println("the result of sum is " + result);
    }
}
