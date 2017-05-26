package Module_2.Laba_2_13_ENUMS;

/*Create a class Main with a main(). Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART)
and Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING values}.
In method main() create and fill (using nested loops) array of Card objects (standard 52-card deck).
Add code which iterate over Card array and print full card name to console.
Example of program output:
The Card: KING_HEART
...
The Card: QUEEN_DIAMOND
...*/
public class Main_4 {
    enum Suit {SPADE, DIAMOND, CLUB, HEART};
    enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    public static void main(String[] args) {
        printCards(createCards());
    }

    public static Card[] createCards(){
        byte i=0;
        Card[] cards = new Card[52];
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
        return cards;
    }

    public static void printCards(Card[] cards){
        for (Card card : cards){
            System.out.println("The Card: "+card);
        }
    }
}
