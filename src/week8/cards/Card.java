package week8.cards;


public class Card {
    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;
    private final int value;
    private final int suit;
    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }


    @Override
    public String toString() {
        String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        String suitText = suits[this.suit];
        if (value == 11) {
            return "J  of " + suitText;
        }
        else if (value == 12) {
            return "Q  of " + suitText;
        }
        else if (value == 13) {
            return "K  of " + suitText;
        } else if (value == 14) {
            return "A  of " + suitText;
        } else{
            return  this.value + " of " + suitText;
        }
    }
}
