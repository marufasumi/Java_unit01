
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class GuessingGame {

 public static void guessingGame() throws InterruptedException {

     System.out.println("Howdy, what's your name?");
     System.out.println("(type in your name) ");
     Scanner input = new Scanner(System.in);
     String name = input.nextLine();

     System.out.println("Hello, " + name + "!");

     System.out.println(name + " I'm thinking of a number between 1 and 100.");
     System.out.println("Can you guess what the number is?");

     // create an instance of the Random object
     Random rand = new Random();

// call method nextInt and pass in upper range bound
     int number = rand.nextInt(100);
     int tries = 0;

     while (true) {
         int guess;
         try {
             guess = input.nextInt();
             tries = tries + 1;

             if (guess < number) {
                 System.out.println("Your guess is too low, try again.");
             } else if (guess > number) {
                 System.out.println("Your guess is too high, try again.");
             } else {
                 System.out.println("Well done " + name);
                 System.out.println("You found my number in " + tries + " tries!");
                 break;
             }

         } catch (InputMismatchException e) {
             String bad_input = input.next();   // need to progress past bad input
             System.out.println("That's not an integer, try again");

            // if (bad_input.equals("q")) {
                 //System.out.println("Exiting the game...");
                 //System.exit(0);
             //}

             continue;
         }

         if (guess < 1 || guess > 100) {
             System.out.println(guess + " is not a valid number, try again");
             continue;
         }
     }


 }

}

