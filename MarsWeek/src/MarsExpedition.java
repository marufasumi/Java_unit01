
import java.util.Scanner;
public class MarsExpedition {
    public static void marsExpedition() throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();
        if(teamSize>2){
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");


        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }


        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");

        }


    }

