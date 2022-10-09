import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String playerAMove = null;
        String playerBMove = null;
        String decision = null;
        String trash;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player A, enter your move");
        if (scanner.hasNext()) {
            playerAMove = scanner.next();
            scanner.nextLine();
            System.out.println("Player A move is " + playerAMove);
        }
        else {
            trash = scanner.nextLine();
            System.out.println("Incorrect formatting please enter your move with R, P, or S");
            System.exit(0);
        }


        System.out.println("Player B, enter your move");
        if (scanner.hasNext()) {
            playerBMove = scanner.next();
            scanner.nextLine();
            System.out.println("Player B move is " + playerBMove);
        }
        else {
            trash = scanner.nextLine();
            System.out.println("Incorrect formatting please enter your move with R, P, or S");
            System.exit(0);
        }

        if (playerAMove.equalsIgnoreCase("R"))

            if(playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Its a tie");
            } else if (playerBMove.equalsIgnoreCase( "P")){
                System.out.println("Paper covers rock, Player B wins!");
            } else if (playerBMove.equalsIgnoreCase("S")){
                System.out.println("Rock breaks scissors, Player A wins!");
            }

            else if (playerAMove.equalsIgnoreCase("P")){

            if(playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock, Player A wins!");
            } else if (playerBMove.equalsIgnoreCase("P")){
                System.out.println("It's a tie");
            } else if (playerBMove.equalsIgnoreCase("S")){
                System.out.println("Scissors cuts paper, Player B wins!");
            }

            else if (playerAMove.equalsIgnoreCase("S"))

                if(playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks scissors, Player B wins!");
                } else if (playerBMove.equalsIgnoreCase("P")){
                    System.out.println("Scissors cuts paper, Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("S")){
                    System.out.println("It's a tie!");
                }
        }
        System.out.println("Would you like to continue? [Y/N]");
            if (scanner.hasNext()) {
                decision = scanner.next();
                scanner.nextLine();
            }
            else {
                trash = scanner.nextLine();
                System.out.println("Incorrect formatting please enter your move with R, P, or S");
                System.exit(0);
            }
            if (decision.equalsIgnoreCase("Y")) {
                System.out.println("Loading next round...");
            }

            else if (decision.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
        }
    }
