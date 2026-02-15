import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to generate computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate average and percentage
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display game results and statistics
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("--------------------------------------------------");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("--------------------------------------");
        System.out.println("Player\tWins\tWinning %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();  // consume newline

        String[][] gameResults = new String[totalGames][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);

        displayResults(gameResults, stats);

        sc.close();
    }
}
