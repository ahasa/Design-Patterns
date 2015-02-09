package abstractFactory;

import abstractFactory.Account.AccountType;
import abstractFactory.Card.CardType;

public interface ServiceFactory {

	public Card getCard(CardType cardType);

	public Account getAccount(AccountType accountType);
}
