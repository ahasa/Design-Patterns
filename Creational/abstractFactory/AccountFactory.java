package abstractFactory;

import abstractFactory.Account.AccountType;
import abstractFactory.Card.CardType;

public class AccountFactory implements ServiceFactory {

	public AccountFactory() {
	}

	@Override
	public Card getCard(CardType cardType) {
		return null;
	}

	@Override
	public Account getAccount(AccountType accountType) {
		Account account = null;
		switch (accountType) {
		case Saving:
			account = new SavingAccount();
			break;
		case Checking:
			account = new CheckingAccount();
		}
		return account;
	}
}
