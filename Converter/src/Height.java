import java.util.InputMismatchException;
import java.util.Scanner;

public class Height {
    private double height;

    public Height(double height) {

        this.height = height;
    }

    public String convert(double height) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Convert to: 1. Cm, 2. M, 3.Km, 4.Inch, 5.Miles, 6. Yard, 7. Foot, 0.Exit: ");
        try {
            int choice = sc1.nextInt();
            String formatedValue;

            if (choice == 1) {
                formatedValue = String.format("%.2f", (height * 100));
                return "Height in Centimeters: " + formatedValue + "cm";

            } else if (choice == 2) {
                //1m = 100cm
                formatedValue = String.format("%.2f", (height));
                return  "Height in Meters: " + formatedValue + "m";

            } else if (choice == 3) {
                //1km = 1000m
                formatedValue = String.format("%.2f", (height / 1000));
                return "Height in Kilometers: " + formatedValue + "Km";

            } else if (choice == 4) {
                //1M = 39.3701inches
                formatedValue = String.format("%.2f", (height * 39.3701));
                return "Height in Inches: " + formatedValue + "inches";

            } else if (choice == 5) {
                //1 mile = 1609.34m
                formatedValue = String.format("%.2f", (height / 1609.34));
                return "Height in Miles: " +formatedValue + "miles";
            } else if (choice == 6) {
                //1m = 1.09361yards
                formatedValue = String.format("%.2f", (height * 1.09361));
                return "Height in Yards: " + formatedValue + "yards";

            } else if (choice == 7) {
                //1 m = 3.28084
                formatedValue = String.format("%.2f", (height * 3.28084));
                return "Height in Feet: " + formatedValue + "feet";

            } else if (choice == 0) {
                return "Exiting...";

            } else {
                return "Incorrect choice";
            }
        } catch (InputMismatchException ime) {
            return "Enter numbers only";

        }

    }
}


