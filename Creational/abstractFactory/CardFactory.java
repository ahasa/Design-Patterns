package abstractFactory;

import abstractFactory.Account.AccountType;
import abstractFactory.Card.CardType;

public class CardFactory implements ServiceFactory {

	public CardFactory() {

	}

	@Override
	public Card getCard(CardType cardType) {
		Card card = null;
		if (cardType == null)
			return null;

		switch (cardType) {
		case Debit:
			card = new DebitCard();
			break;
		case Credit:
			card = new CreditCard();
		}
		return card;
	}

	@Override
	public Account getAccount(AccountType accountType) {
		return null;
	}
}
