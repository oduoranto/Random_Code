import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hello, what do you want to convert: 1.Height, 2. Weight, 0. Exit: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter your Height(Meters): ");
            //height default in Metres
            try {
                double height1 = sc.nextDouble();
                Height gt = new Height(height1);
                System.out.println(gt.convert(height1));

            } catch (InputMismatchException ime) {
                System.out.println("Enter numbers only");

            }
        } else if (choice == 2) {


            System.out.print("Enter your weight(Kilograms): ");


            try {

                double weight1 = sc.nextDouble();
                Weight wght = new Weight(weight1);
                System.out.println(wght.convert(weight1));

            } catch (InputMismatchException ime) {

                System.out.println("Enter  numbers only!!");

            }

        }else if(choice == 0) {
            System.out.println("Exiting...");
        }
        else{
            System.out.println("Incorrect input!!");
        }
    }
}