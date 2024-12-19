package primitiveTypes;

import java.util.Scanner;

public class Short {
    public static void main(String[] args) {
        //division of two numbers
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number (short): ");
        short numbOne = scanner.nextShort();

        System.out.print("enter another number (short): ");
        short numbTwo = scanner.nextShort();

        short result = (short) (numbOne / numbTwo);

        System.out.println("the division is: " + result);

        scanner.close();
    }
}
