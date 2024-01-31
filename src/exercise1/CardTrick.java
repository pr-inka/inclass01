package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : Prinka
 * @date 31 Jan, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(random.nextInt(4));
            hand[i] = card;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pick a card (Enter value between 1-13 and select suit between 1-4):");
            int userValue = scanner.nextInt();
            int userSuit = scanner.nextInt();
            
            boolean found = false;
            for (Card card : hand) {
                if (card.getValue() == userValue && card.getSuit() == userSuit - 1) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                printInfo();
            } else {
                System.out.println("Sorry, your card is not in the hand.");
            }
        }
    }
    //I'm done
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is prinka, and you can call me prinka.");
        System.out.println();
        System.out.println("My career ambitions: To become programmer");
        System.out.println("-- Be more active on Social media");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();
        System.out.println("My hobbies: drawing");
        System.out.println("-- Singing");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Dancing");
        System.out.println();
    }

    private static class Card {
        private int value;
        private int suit;

        public Card() {
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getSuit() {
            return suit;
        }

        public void setSuit(int suit) {
            this.suit = suit;
        }
    }
}
