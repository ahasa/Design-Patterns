package abstractFactory;

public class FactoryProducer {

	public static ServiceFactory getFactory(String factoryName) {
		ServiceFactory serviceFactory = null;
		if (factoryName == null) {
			return null;
		}
		switch (factoryName.toLowerCase()) {
		case "card":
			serviceFactory = new CardFactory();
			break;
		case "account":
			serviceFactory = new AccountFactory();
			break;
		}
		return serviceFactory;
	}
}
