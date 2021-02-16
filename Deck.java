package assignment8;

public class Deck {
	public static int numS = 4;
    public static int numR = 13;
    public static int numCards = numS * numR;

    private Card[][] cards;

    public Deck() 
    {
        cards = new Card[numS][numR];
        int i = 0;
        for (Suits suit : Suits.values()) 
        {
        	int j = 0;
            for (Rank rank: Rank.values()) 
            {
                cards[i][j] = new Card(rank, suit);
                j++;
            }
            i++;
        }
    }

    public Card getCard(int suit, int rank) 
    {
        return cards[suit-1][rank-1];
    }
}