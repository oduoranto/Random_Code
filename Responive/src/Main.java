import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

while(true) {

    System.out.println("AI: Hello, what's your name? ");
    System.out.print("Me: ");
    String name = sc.nextLine();

    System.out.println("AI: How old are you? ");
    System.out.print("Me: ");

    String age = sc.nextLine();
    String town = town();

    String hobby = hobby();

    System.out.println("***********************************************************************");

    System.out.println("You are " + name + ". Your home town is  " + town + ".You love " + hobby);

    System.out.println("************************************************************************");

       }
 }

    public static String town(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("AI: What's your town? ");
        System.out.print("Me: ");
        String town = sc1.nextLine();
        return town;
    }
    public static String hobby(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("AI: What's your hobby? ");
        System.out.print("Me: ");
        String hobby = sc2.nextLine();
        return hobby;

    }
}
