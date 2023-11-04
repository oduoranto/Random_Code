import java.util.Scanner;

public class Network {
    private int networkName;
    Scanner sc = new Scanner(System.in);

    public Network( int networkName) {

        this.networkName = networkName;
    }
     public String asap(){
        //password is @prosper
         System.out.print("Enter your password: ");
         String passwordEntered= sc.next();
         System.out.println("***********************************************");
         switch (passwordEntered){


             case "@prosper": return "connecting..";
             default: return ">>Incorrect password<<";
         }
     }

     public String secondFloor(){
        //password @Secondfloor
         System.out.print("Enter your password: ");
         String passwordEntered= sc.next();
         System.out.println("***********************************************");

         switch(passwordEntered){
             case "@Secondfloor": return "connecting..";
             default: return ">>Incorrect password<<";

         }
     }

     public String thirdFloor() {
        //password @Thirdfloor
         System.out.print("Enter your password: ");
         String passwordEntered = sc.next();
         System.out.println("***********************************************");

         switch (passwordEntered) {
             case "@Thirdfloor":
                 return "connecting..";
             default:
                 return ">>Incorrect password<<";
         }
     }
}
