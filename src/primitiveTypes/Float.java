package primitiveTypes;

import java.util.Locale;
import java.util.Scanner;

public class Float {
    public static void main(String[] args) {
        // calculating Average of Two Grades
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("enter your firts note: ");
        float firstNote = scanner.nextFloat();

        System.out.println("enter your second note: ");
        float secondNote = scanner.nextFloat();

        float average = (firstNote + secondNote) / 2;
        System.out.println("the result of your average is: " + average);
    }
}
