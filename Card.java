
import java.util.Random;

public class Card {
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Suit suit;
    private Rank rank;

    public Card() {
        Random rand = new Random();
        
        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();
        
        this.suit = allSuits[rand.nextInt(allSuits.length)];
        this.rank = allRanks[rand.nextInt(allRanks.length)];
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getFace() {
        String faceValue = "";

        if (rank == Rank.TEN) {
            faceValue += "T";
        } else if (rank == Rank.JACK) {
            faceValue += "J";
        } else if (rank == Rank.QUEEN) {
            faceValue += "Q";
        } else if (rank == Rank.KING) {
            faceValue += "K";
        } else if (rank == Rank.ACE) {
            faceValue += "A";
        } else {
            faceValue += (rank.ordinal() + 2);
        }

        faceValue += " " + suit.name();

        return faceValue;
    }

    public static void main(String[] args) {
        Card queenOfHearts = new Card(Suit.HEART, Rank.QUEEN);
        System.out.println("The following card should be the queen of hearts,");
        System.out.println(queenOfHearts.getFace());

        System.out.println("\n10 random cards...");
        
        for (int i = 0; i < 10; i++) {
            Card randomCard = new Card();
            System.out.println(randomCard.getFace());
        }
    }
}