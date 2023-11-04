import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your Kitchen Passcode: ");
            int passcode = sc.nextInt();

            if (passcode == 4499) {
                System.out.print("What do you want to use: 1.Refrigirator, 2.Coffee Maker, 3.Dish Washer, 0. Exit: ");
                int choice1 = sc.nextInt();

                if (choice1 == 1) {

                    getIt(passcode, choice1);
                } else if (choice1 == 2) {
                    getIt(passcode, choice1);
                } else if (choice1 == 3) {
                    getIt(passcode, choice1);
                } else if (choice1 == 0) {
                    System.out.println(">>Exiting...");
                } else {
                    System.out.println(">>Incorrect Input...");
                }
            } else {
                System.out.println("Incorrect Passcode");

            }
        } catch (InputMismatchException ime) {
            System.out.println(">>Numbers Please..");
        }


        //kitchenPasscode is 4499;


    }

    public static void getIt(int password, int choice1) {

        Scanner sc = new Scanner(System.in);

        if (choice1 == 1) {

            System.out.print("Enter Kitchen name: ");
            String name = sc.nextLine();

            System.out.print("Do want sth: [1 for True, 2 for False, 0 to exit]: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                boolean work = true;
                Refrigirator ref = new Refrigirator(name, work);

                System.out.println(ref.orderFood());

            } else if (choice == 2) {
                boolean work = false;
                Refrigirator ref = new Refrigirator(name, work);

                System.out.println(ref.orderFood());

            } else {

                System.out.println(">>Incorrect passcode exiting..");
            }

        } else if (choice1 == 2) {


            if (password == 4499) {

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print(name + " Do want Coffee: [1 for True, 2 for False, 0 to Exit]: ");
                int coffeChoice = sc.nextInt();

                if (coffeChoice == 1) {

                    boolean coffTrue = true;
                    System.out.print("How many cups: ");
                    int cups = sc.nextInt();

                    CoffeMaker coffee = new CoffeMaker(name, coffTrue);
                    // System.out.println(cups + " Cups Of Coffee " + coffee.brewCoffee());
                    SmartKitchen smart = new SmartKitchen(null, coffee, null, null);

                    System.out.println("Do you want milk: [1 for yes, 2 for no, 0 to exit]:");
                    int cee = sc.nextInt();

                    if (cee == 1) {

                        System.out.println(coffee.brewCoffee());
                        System.out.println(cups + " Cups Of Coffee with  milk " + smart.pourMilk());

                    } else if (cee == 2) {

                        System.out.println(coffee.brewCoffee());
                        System.out.println(cups + " Cups Of Coffee with no milk " + smart.pourMilk());

                    } else if (cee == 0) {

                        System.out.println(">>Exiting..");

                    } else {

                        System.out.println(">>Incorrect choice");

                    }
                } else if (coffeChoice == 2) {

                    boolean coffFalse = false;
                    CoffeMaker coffee = new CoffeMaker(name, coffFalse);

                    System.out.println(coffee.brewCoffee());

                } else if (coffeChoice == 0) {

                    System.out.println(">>Exiting..");
                } else {

                    System.out.println(">>Incorrect Choice..");
                }
            }

        } else if (choice1 == 3) {


            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print(name + "! Do you want to wash dishes [ 1 for True, 2 for False, 0 to Exit]: ");
            int dishesChoice = sc.nextInt();

            System.out.print("Do you want to load dishes [1. For Yes, 2. For No, 0 to exit]: ");
            int loadDishesChoice = sc.nextInt();

            if (loadDishesChoice == 1 || loadDishesChoice == 2) {

                if (dishesChoice == 1) {
                    System.out.print("Do you want to add water (choose: [1 for Yes, 2 for No, 0 to Exit]:  ");
                    int water = sc.nextInt();
                    if (water == 1) {

                        boolean dishTrue = true;

                        DishWasher washer = new DishWasher(name, dishTrue);
                        SmartKitchen smart = new SmartKitchen(null, null, washer, null);

                        System.out.println(smart.addWater());
                        System.out.println(washer.doDishes());


                    } else if (water == 2) {
                        boolean dishTrue = true;

                        DishWasher washer = new DishWasher(name, dishTrue);
                        System.out.println(washer.doDishes());

                    } else if (water == 0) {
                        System.out.println(">>Exiting..");
                    } else {
                        System.out.println(">>Incorrect Input..");
                    }

                } else if (dishesChoice == 2) {

                    boolean dishFalse = false;
                    DishWasher washer = new DishWasher(name, dishFalse);

                    System.out.println(washer.doDishes());

                } else if (dishesChoice == 0) {

                    System.out.println(">>Exiting..");

                } else
                    System.out.println(">>Incorrect input..");


            } else if (choice1 == 0) {

                System.out.println(">>Exiting...");

            } else {
                System.out.println(">>Exiting...");
            }


        }

    }
}
