import java.util.Scanner;
public class House{
    Scanner sc = new Scanner (System.in);
    public void Asap_house1(){

        String [] asap_House = {"3 bedroom", "90ms/square/295ft" ,"Sh.40,000", "2"};

       // Select your preferred option from the choices available
        while(true) {
            System.out.println("________________________________________________________");
            //@>> shows the number of steps
            System.out.print(">>Select what you want to know;\n1. For number of bedrooms," +
                    "\n2. For the size,\n3. for price,\n4. For Floor,\n5. To exit: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println(">Number of bedroom-> " + asap_House[0]);
            }else if (choice == 2) {
                System.out.println(">Size of house -> " + asap_House[1]);
            }else if (choice == 3) {
                    System.out.println(">The price -> " + asap_House[2]);
                }else if (choice == 4) {
                        System.out.println(">The Floor -> " + asap_House[3] + "nd");
                    }else if (choice == 5) {
                System.out.println(">Exiting..");
                break;

            } else {
                System.out.println(">Invalid input");


            }
        }}

    public void Asap_house20(){

        String [] asap_House20 = {"2 bedroom", "60ms/square/197ft" ,"Sh.30,000", "4"};
while(true){
    System.out.println("________________________________________________________");
            //gives you option to selct  your preffered curiosity
            System.out.print(">Select what you want to know;\n1. For number of bedrooms," +
                    "\n2. For the size,\n3. for price,\n4. For the floor,\n5. To exit: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println(">Number of bedroom-> " + asap_House20[0]);
            }else if (choice == 2) {
                    System.out.println(">Size of house -> " + asap_House20[1]);
                }else if (choice == 3) {
                        System.out.println(">The price -> " + asap_House20[2]);
                    }else if (choice == 4) {
                            System.out.println(">The Floor -> " + asap_House20[3]);
                        }else if (choice == 5) {
                System.out.println(">Exiting..");
                break;
            }
            else {
                System.out.println(">Invalid input, try again");

            }
        }
    }
    public void Asap_house90(){

        String [] asap_House90 = {"4 bedroom", "100ms/square/328ft" ,"Sh.70,000","3"};
while(true) {
    // Select the option you prefer
    System.out.println("________________________________________________________");
    System.out.print("Select what you want to know;\n1. For number of bedrooms," +
            "\n2. For the size,\n3. for price,\n4. For the floor,\n5. To exit: ");
    int choice = sc.nextInt();

    if (choice == 1) {

        System.out.println(">Number of bedroom-> " + asap_House90[0]);
    }else if (choice == 2) {
        System.out.println(">Size of house -> " + asap_House90[1]);
    }else if (choice == 3) {
            System.out.println(">The price -> " + asap_House90[2]);
        }else if (choice == 4) {
        System.out.println(">The Floor -> " + asap_House90[3]);
    }else if (choice == 5) {
        System.out.println(">Exiting..");
        break;
    }
    else {
        System.out.println(">Invalid input, try again");

    }
}}

    public void Asap_house50(){
        String [] asap_House50 = {"3 bedroom", "95ms/square/311ft" ,"Sh.45,000", "8"};
        while(true){
        // Scanner sc = new Scanner (System.in);
            System.out.println("________________________________________________________");
        System.out.print(">Select what you want to know;\n1. For number of bedrooms," +
                "\n2. For the size,\n3. for price,\n4. For the floor,\n5. To exit: ");
        int choice = sc.nextInt();

        if(choice == 1) {

            System.out.println(">Number of bedroom-> " + asap_House50[0]);
        }else if(choice ==2) {
                System.out.println(">Size of house -> " + asap_House50[1]);
            }else if (choice == 3) {
                    System.out.println(">The price -> " + asap_House50[2]);
                }else if (choice == 4) {
                        System.out.println(">The Floor -> " + asap_House50[3]);
                    }else if (choice == 5) {
            System.out.println(">Exiting..");
            break;
        }
        else {
            System.out.println(">Invalid input, try again");

        }
    }
}}
























