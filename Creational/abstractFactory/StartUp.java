package abstractFactory;

import abstractFactory.Account.AccountType;
import abstractFactory.Card.CardType;
import abstractFactory.ServiceFactory.FactoryType;

public class StartUp {

	public static void main(String[] args) {

		ServiceFactory cardFactory = FactoryProducer
				.getFactory(FactoryType.Card);
		Card debitCard = cardFactory.getCard(CardType.Debit);
		Card creditCard = cardFactory.getCard(CardType.Credit);

		ServiceFactory accountFactory = FactoryProducer
				.getFactory(FactoryType.Account);

		Account savingAccount = accountFactory.getAccount(AccountType.Saving);
		Account checkingAccount = accountFactory
				.getAccount(AccountType.Checking);

		System.out.println(debitCard.getCardType());

		System.out.println(creditCard.getCardType());

		System.out.println(savingAccount.getAccountType());

		System.out.println(checkingAccount.getAccountType());

	}
}
