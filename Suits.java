package assignment8;

public enum Suits {
	DIAMONDS(1), CLUBS(2), HEARTS(3), SPADES(4);
	private int value;
	Suits(int val)
	{
		this.value = val;
	}
	public int GetValue()
	{
		return this.value;
	}
}
