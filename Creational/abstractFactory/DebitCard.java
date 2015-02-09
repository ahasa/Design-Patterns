package abstractFactory;

public class DebitCard implements Card {
	private String cardNumber;
	private CardType cardType;

	public DebitCard() {
		this.cardType = CardType.Debit;

	}

	public DebitCard(String cardNumber) {
		this.cardNumber = cardNumber;
		this.cardType = CardType.Debit;
	}

	@Override
	public String getCardNumber() {
		return this.cardNumber;
	}

	@Override
	public CardType getCardType() {
		return this.cardType;
	}

}
