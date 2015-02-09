package abstractFactory;

import abstractFactory.ServiceFactory.FactoryType;

public class FactoryProducer {

	public static ServiceFactory getFactory(FactoryType factoryName) {
		ServiceFactory serviceFactory = null;
		if (factoryName == null) {
			return null;
		}
		switch (factoryName) {
		case Card:
			serviceFactory = new CardFactory();
			break;
		case Account:
			serviceFactory = new AccountFactory();
			break;
		}
		return serviceFactory;
	}
}
