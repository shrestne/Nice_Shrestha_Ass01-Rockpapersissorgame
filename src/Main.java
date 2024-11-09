import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            // Get valid moves from both players
            String playerA = getPlayerMove(scanner, "Player A");
            String playerB = getPlayerMove(scanner, "Player B");

            // Determine and display the result
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock – it’s a Tie!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors – it’s a Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper – it’s a Tie!");
                } else if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            } else {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }

            // Ask if players want to play again
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
    private static String getPlayerMove(Scanner scanner, String player) {
        String move;
        do {
            System.out.print(player + ", enter your move (R, P, S): ");
            move = scanner.nextLine().trim();
            if (!move.equalsIgnoreCase("R") && !move.equalsIgnoreCase("P") && !move.equalsIgnoreCase("S")) {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        } while (!move.equalsIgnoreCase("R") && !move.equalsIgnoreCase("P") && !move.equalsIgnoreCase("S"));
        return move;
        // Method to get a valid move from a player
    }}