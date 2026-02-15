import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {

        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int random = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cardsEach) {

        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }

        int index = 0;

        for (int i = 0; i < players; i++) {

            System.out.println("\nPlayer " + (i + 1) + " Cards:");

            for (int j = 0; j < cardsEach; j++) {
                System.out.println(deck[index++]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter cards per player: ");
        int cardsEach = sc.nextInt();

        distribute(deck, players, cardsEach);

        sc.close();
    }
}
