import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            ;


            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int crapsRoll = die1 + die2;


            System.out.println("You rolled a " + die1 + " and a " + die2 + ", your sum is: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Craps, you've lost the game!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You got a Natural, you won!");
            } else {
                int point = crapsRoll;
                System.out.println("You rolled " + point + "!");


                while (true) {

                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    if (crapsRoll == point) {
                        System.out.println("You made the point, you win!");
                        break;
                    } else if (crapsRoll == 7) {
                        System.out.println("You rolled a 7, you've lost!");
                        break;
                    }

                }

            }
            System.out.println("Would you like to play again? (Y/N):");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                playAgain = false;
            }

        }

    }
}