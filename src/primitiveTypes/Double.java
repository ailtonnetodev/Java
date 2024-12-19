package primitiveTypes;

import java.util.Locale;
import java.util.Scanner;

public class Double {
    public static void main(String[] args) {

        // calculating bmi with double

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("calculating your BMI");
        System.out.println("_____________________________________________________________");

        System.out.println("enter your weight: ");
        double numberWeight = scanner.nextDouble();

        System.out.println("enter your height: ");
        double numberHeight = scanner.nextDouble();

        double bmi = numberWeight / ( numberHeight * numberHeight );
        System.out.println("the result is: " + bmi);
    }
}
