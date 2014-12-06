package builder;

import java.util.ArrayList;
import java.util.List;

import builder.entities.BreadType;
import builder.entities.CheeseType;
import builder.entities.MeatType;

public class BurgerBuilder extends SandwichBuilder{

	@Override
	public void prepareBread() {
		sandwich.setBreadType(BreadType.BreadRoll);
	}

	@Override
	public void applyMeatAndCheese() {
		sandwich.setMeatType(MeatType.Ox);
		sandwich.setCheeseType(CheeseType.Saga);

	}

	@Override
	public void applyVegetables() {
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Cucumber");
		sandwich.setVegetables(vegetables);
	}

	@Override
	public void addSpices() {
		sandwich.setHasMustard(true);
	}

}
