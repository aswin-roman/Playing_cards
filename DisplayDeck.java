package assignment8;


public class DisplayDeck {
	public static void main(String[] args) {
        Deck D1 = new Deck();
        for (int suit = Suits.DIAMONDS.GetValue(); suit <= Suits.SPADES.GetValue(); suit++) 
        {
            for (int rank = Rank.ACE.GetValue(); rank <= Rank.KING.GetValue(); rank++) 
            {
                Card card = D1.getCard(suit, rank);
                System.out.format("%s of %s%n", Card.rankToString(card.getRank()), Card.suitToString(card.getSuit()));
            }
        }
    }
}