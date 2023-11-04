import java.util.InputMismatchException;
import java.util.Scanner;

public class Weight {
    private double weight;

    public Weight(double weight) {

        this.weight = weight;
    }
    public String convert(double weight) {

        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Convert to: 1.Gram, 2.Kilogrames, 3.Pounds, 4.Tonnes, 0.Exit: ");

            int choice = sc.nextInt();
            String toDecimal;
            if (choice == 1) {
                //1Kg = 1000g
                toDecimal = String.format("%.2f", (weight * 1000));
                return "Weight in grams: " +toDecimal + "Grams";

            } else if (choice == 2) {
                //
                toDecimal = String.format("%.2f", (weight));
                return "Weight in Kiliograms: " + toDecimal + "Kg";
            }else if (choice == 3) {
                    //1kg = 2.20462
                    toDecimal = String.format("%.2f", (weight * 2.20462));
                    return "Weight in Pounds: " + toDecimal + "Pounds";
                }
             else if (choice == 4) {
                //1T = 1000kg
                toDecimal = String.format("%.2f", (weight / 1000));
                return "Weight in Tonnes: " + toDecimal + "T";

            } else if (choice == 0) {
                return "Exiting...";
            }else {
                return ">>Enter numbers only<<";
            }

        }catch(InputMismatchException ime){
            return ">>Enter numbers only<<";
        }
    }
}
