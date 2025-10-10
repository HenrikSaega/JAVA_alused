package week8.cards;
import java.util.Arrays;

public class Exercise15 {
    public static void main(String[] args) {
        /* Card first = new Card(1, Card.DIAMONDS);
        Card second = new Card(3, Card.DIAMONDS);
        Card third = new Card(12, Card.DIAMONDS);
        Card fourth = new Card(9, Card.DIAMONDS);
        Card fifth = new Card(14, Card.DIAMONDS); */

        Card[] cards = {
                new Card(10, Card.CLUBS),
                new Card(10, Card.SPADES),
                new Card(14, Card.HEARTS),
                new Card(11, Card.DIAMONDS),
                new Card(10, Card.HEARTS)
        };

        Arrays.sort(cards);

        /* System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth); */

        for (Card card : cards) {
            System.out.println(card);
        }

    }
}