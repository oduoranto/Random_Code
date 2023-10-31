import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(1,3);
        System.out.println(random);
        // opens the game depending on your choice
        //if you select @1 it continues to play
        //If you selct @2 you exit the game
        System.out.println("Hello! Want to play rock,paper, scissors?");
        System.out.println("1.yes to play.... 2.No to quite: ");

        int choice = sc.nextInt();

        if (choice == 1) {

           String name = name();


                System.out.println(">1.Rock >> 2. Paper >>> 3. Scissors ");
                int choice2 = sc.nextInt();
            System.out.println(  response(random, choice2, name));


        } else {
            System.out.println("Exiting...");
        }


    }
    public static String name(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc1.nextLine();
        return " " + name;
    }

    public static String response(int random, int choice2, String name) {
        if (random == 1 && choice2 == 3 || random == 2 && choice2 == 3 || random == 3 && choice2 == 2) {
            return ">>Ai Wins!<<";
        }
        else if(choice2 > 3||choice2 < 1){
            return "Incorrect choice";
        }
        else{
            return ">>" + name + " Wins!<<";
        }


    }
}

