import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        House house = new House();

        while(true) {
            System.out.println("*************************************************************************");
            System.out.print(">Available houses;\n1. For Asap_house,\n2. For Asap_house20,\n3. For Asap_house90,\n4. For Asap_house50,\n5. to exit :");
            int choice = sc.nextInt();

            //calls method from class House
            if (choice == 1) {
                house.Asap_house1();
            } else if (choice == 2) {
                house.Asap_house20();
            } else if (choice == 3) {
                house.Asap_house90();
            } else if (choice == 3) {
                house.Asap_house50();
            } else if (choice == 5) {
                System.out.println(">Exiting..");
                break;
            }else{
                System.out.println("-->Invalid input, try again");
            }

        }
    }
}