import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int numberOfGames = scanner.nextInt();

        // Play games and get results
        String[][] gameResults = playGames(numberOfGames, scanner);

        // Calculate statistics
        String[][] statistics = calculateStatistics(gameResults);

        // Display results
        displayResults(gameResults, statistics);

        scanner.close();
    }

    // Method to find computer choice using Math.random
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock";
        }
    }

    // Method to find winner between user and computer
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }

        // Rock crushes scissors
        if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "Player";
        }
        if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
            return "Computer";
        }

        // Paper covers rock
        if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "Player";
        }
        if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            return "Computer";
        }

        // Scissors cuts paper
        if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "Player";
        }
        if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
            return "Computer";
        }

        return "Tie";
    }

    // Method to play games and return results
    public static String[][] playGames(int numberOfGames, Scanner scanner) {
        String[][] results = new String[numberOfGames][4]; // Game, Player, Computer, Winner

        for (int i = 0; i < numberOfGames; i++) {
            System.out.println("\nGame " + (i + 1) + ":");
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            results[i][0] = String.valueOf(i + 1); // Game number
            results[i][1] = userChoice; // Player choice
            results[i][2] = computerChoice; // Computer choice
            results[i][3] = winner; // Winner
        }

        return results;
    }

    // Method to calculate statistics
    public static String[][] calculateStatistics(String[][] gameResults) {
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int i = 0; i < gameResults.length; i++) {
            switch (gameResults[i][3]) {
                case "Player":
                    playerWins++;
                    break;
                case "Computer":
                    computerWins++;
                    break;
                case "Tie":
                    ties++;
                    break;
            }
        }

        double playerPercentage = (double) playerWins / gameResults.length * 100;
        double computerPercentage = (double) computerWins / gameResults.length * 100;

        String[][] statistics = new String[3][3];
        statistics[0][0] = "Player";
        statistics[0][1] = String.valueOf(playerWins);
        statistics[0][2] = String.format("%.1f", playerPercentage);

        statistics[1][0] = "Computer";
        statistics[1][1] = String.valueOf(computerWins);
        statistics[1][2] = String.format("%.1f", computerPercentage);

        statistics[2][0] = "Ties";
        statistics[2][1] = String.valueOf(ties);
        statistics[2][2] = String.format("%.1f", (double) ties / gameResults.length * 100);

        return statistics;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] statistics) {
        System.out.println("\n=== GAME RESULTS ===");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("----\t------\t--------\t------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%s\t%s\t%s\t\t%s\n",
                    gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        }

        System.out.println("\n=== STATISTICS ===");
        System.out.println("Player\tWins\tPercentage");
        System.out.println("------\t----\t----------");

        for (int i = 0; i < statistics.length; i++) {
            System.out.printf("%s\t%s\t%s%%\n",
                    statistics[i][0], statistics[i][1], statistics[i][2]);
        }
    }
}
