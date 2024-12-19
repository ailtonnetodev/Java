package primitiveTypes;

import java.util.Locale;
import java.util.Scanner;

public class Long {
    public static void main(String[] args) {
        // use short numbers of this example
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("enter a number: ");
        long numberOne = scanner.nextLong();

        System.out.println("enter another number: ");
        long numberTwo = scanner.nextLong();

        long result = numberOne * numberTwo;
        System.out.println("the result for this example is: " + result);
    }
}
