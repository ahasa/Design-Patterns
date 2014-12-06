package builder;

import builder.entities.Sandwich;

public class SanwichMaker {
	private SandwichBuilder builder;
	
	public SanwichMaker(SandwichBuilder builder){
		this.builder = builder;
	}
	
	public void buildSandwich(){
		builder.createSandwich();
		builder.prepareBread();
		builder.applyMeatAndCheese();
		builder.applyVegetables();
		builder.addSpices();
	}
	
	public Sandwich getSandwich(){
		return builder.getSandwich();
	}
}
