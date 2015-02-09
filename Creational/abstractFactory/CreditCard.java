package abstractFactory;

public class CreditCard implements Card {
	private String cardNumber;
	private CardType cardType;

	public CreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
		this.cardType = CardType.Credit;
	}

	public CreditCard() {
		this.cardType = CardType.Credit;
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
