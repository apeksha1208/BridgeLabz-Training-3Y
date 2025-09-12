import java.util.Scanner;

public class CardDeckManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and initialize deck
        String[] deck = initializeDeck();
        System.out.println("Initial deck created with " + deck.length + " cards.");

        // Shuffle deck
        String[] shuffledDeck = shuffleDeck(deck);
        System.out.println("Deck shuffled successfully.");

        // Get number of players and cards per player
        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute cards
        String[][] players = distributeCards(shuffledDeck, numberOfPlayers, cardsPerPlayer);

        // Print results
        printPlayersAndCards(players);

        scanner.close();
    }

    // Method to initialize deck of cards
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // Calculate number of cards in deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle deck of cards
    public static String[] shuffleDeck(String[] deck) {
        String[] shuffledDeck = deck.clone();
        int n = shuffledDeck.length;

        // Step 1: Iterate over the deck and swap each card with a random card
        for (int i = 0; i < n; i++) {
            // Step 2: Generate random card number between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Step 3: Swap the current card with the random card
            String temp = shuffledDeck[i];
            shuffledDeck[i] = shuffledDeck[randomCardNumber];
            shuffledDeck[randomCardNumber] = temp;
        }

        return shuffledDeck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numberOfPlayers, int cardsPerPlayer) {
        // Check if cards can be distributed
        int totalCardsNeeded = numberOfPlayers * cardsPerPlayer;
        if (totalCardsNeeded > deck.length) {
            System.out.println("Error: Not enough cards to distribute " + cardsPerPlayer +
                    " cards to " + numberOfPlayers + " players.");
            System.out.println("Available cards: " + deck.length + ", Needed: " + totalCardsNeeded);
            return new String[0][0];
        }

        // Create 2D array to store players and their cards
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int player = 0; player < numberOfPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                players[player][card] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayersAndCards(String[][] players) {
        if (players.length == 0) {
            return;
        }

        System.out.println("\n=== Card Distribution Results ===");

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            System.out.println("-------------------");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println((j + 1) + ". " + players[i][j]);
            }
        }

        System.out.println("\nTotal players: " + players.length);
        System.out.println("Cards per player: " + players[0].length);
        System.out.println("Total cards distributed: " + (players.length * players[0].length));
    }
}
