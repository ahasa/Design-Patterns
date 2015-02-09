package abstractFactory;

import abstractFactory.Account.AccountType;
import abstractFactory.Card.CardType;

public class StartUp {

	public static void main(String[] args) {

		ServiceFactory cardFactory = FactoryProducer.getFactory("card");
		Card debitCard = cardFactory.getCard(CardType.Debit);
		Card creditCard = cardFactory.getCard(CardType.Credit);

		ServiceFactory accountFactory = FactoryProducer.getFactory("account");

		Account savingAccount = accountFactory.getAccount(AccountType.Saving);
		Account checkingAccount = accountFactory
				.getAccount(AccountType.Checking);

		System.out.println(debitCard.getCardType());

		System.out.println(creditCard.getCardType());

		System.out.println(savingAccount.getAccountType());

		System.out.println(checkingAccount.getAccountType());
	}
}
