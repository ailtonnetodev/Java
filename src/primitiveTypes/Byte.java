package primitiveTypes;

import java.util.Locale;
import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {
        // use negative number for this exercise
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("enter a number: ");
        byte numberOne = scanner.nextByte();

        System.out.println("enter another number: ");
        byte numberTwo = scanner.nextByte();

        byte result = (byte) ((byte)  numberOne + numberTwo);
        System.out.println("the result with byte is: " + result);
    }
}
