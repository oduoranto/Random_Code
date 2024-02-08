import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Choose your network
        System.out.print("Choose  Network\n(Choose a number)\n 1. A.S.A.P,\n 2. SecondFloor,\n 3. Thirdfloor,\n 0 to exit : ");
      try{
        int networkChoice = sc.nextInt();
        //@1 A.S.A.P network
      if (networkChoice == 1){
          Network net = new Network(networkChoice);
          System.out.println(net.asap());

      }//@2 SecondFloor network
      else if (networkChoice == 2) {
          Network net = new Network(networkChoice);
          System.out.println(net.secondFloor());

      }//@3 ThirdFloor network
      else if (networkChoice == 3) {

          Network net = new Network(networkChoice);
          System.out.println(net.thirdFloor());
      }// @0 Exiting option
      else if (networkChoice == 0) {
          System.out.println(">>Exiting..");

      }
      //When option no avaiable on the list
          else{
          System.out.println(">>Choose an available option please..");
      }
    }catch (InputMismatchException ime) {
          // If your enter a chaarcter instead of a number
          System.out.println(">>" +
                  "Numbers only..");
      }
      }
}
