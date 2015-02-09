package abstractFactory;

public interface Account {

	public AccountType getAccountType();

	public enum AccountType {
		Saving, Checking
	}
}
