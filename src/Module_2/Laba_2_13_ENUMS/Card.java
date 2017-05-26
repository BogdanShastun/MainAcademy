package Module_2.Laba_2_13_ENUMS;

import Module_2.Laba_2_13_ENUMS.Main_4.*;

/*Create class Card which has two private fields: cardSuit of Suit type and cardRank of Rank type.
Add to Card constructor with cardSuit and cardRank arguments.
In class Card override toString() method to return full name of card.*/
public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString(){
        return cardRank+"_"+cardSuit;
    }
}
