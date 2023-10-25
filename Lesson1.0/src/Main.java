import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

do {

    Scanner sc = new Scanner(System.in);
    try {

        System.out.print("Enter a number between 0 and 10: ");

        int a = sc.nextInt(); // @ a is the number entered by the user
        verify(a);

        Random random = new Random();
        int b = random.nextInt(0, 10); // the number is on a range of 0 - 10

        if (getA(a, b) == 0) {
            System.out.println("Congratualtions!!You are our lucky winner!!");
            break;
        }
        if (getA(a, b) != 0)
            System.out.print("Try again!! You might be lucky!!/n");

    } catch (InputMismatchException ime) {
        System.out.println("Characters are  not allowed!!"); //if a character is entered
    }
}while(true);
}



    public static void verify(int a){

    if(a < 0 ) System.out.print("Incorrect Input!! "); //check if the number entered is < 0
    if(a > 10 )System.out.println("Incorrect input!! "); //Checks if number entered is > 10

    }

    public static int getA(int a, int b ){
        if(a == b )return 0; //0 to refer to equal
        else return 1; // 1 to refer to not equal

    }
}