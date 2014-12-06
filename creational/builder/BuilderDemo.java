package builder;

import builder.entities.Sandwich;

public class BuilderDemo {

	public static void main(String[] args) {
		SanwichMaker sandwichMaker = new SanwichMaker(new VegetablesBuilder());
		sandwichMaker.buildSandwich();
		
		Sandwich sandwich1 = sandwichMaker.getSandwich();
		sandwich1.display();
	
		SanwichMaker sandwichMaker2 = new SanwichMaker(new BurgerBuilder());
		sandwichMaker2.buildSandwich();
		
		Sandwich sandwich = sandwichMaker2.getSandwich();
		sandwich.display();
	}

}
