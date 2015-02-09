package abstractFactory;

public class CheckingAccount implements Account {
	private AccountType accountType;

	public CheckingAccount() {
		this.accountType = AccountType.Checking;
	}

	@Override
	public AccountType getAccountType() {
		return this.accountType;
	}

}
