package abstractFactory;

public class SavingAccount implements Account {

	private final AccountType accountType;

	public SavingAccount() {
		this.accountType = AccountType.Saving;
	}

	@Override
	public AccountType getAccountType() {
		return this.accountType;
	}

}
