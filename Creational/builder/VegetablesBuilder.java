package builder;

import java.util.ArrayList;
import java.util.List;

public class VegetablesBuilder extends SandwichBuilder{

	@Override
	public void prepareBread() {
		sandwich.setBreadType(BreadType.Black);
	}

	@Override
	public void applyMeatAndCheese() {
		sandwich.setMeatType(MeatType.Vegtables);
		sandwich.setCheeseType(CheeseType.Saga);
	}

	@Override
	public void applyVegetables() {
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("Tomato");
		vegetables.add("Onion");
		sandwich.setVegetables(vegetables);
	}

	@Override
	public void addSpices() {	
		sandwich.setHasMustard(false);
	}

}
