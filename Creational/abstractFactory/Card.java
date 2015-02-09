package abstractFactory;

public interface Card {

	public String getCardNumber();

	public CardType getCardType();

	public enum CardType {
		Credit, Debit
	}
}
