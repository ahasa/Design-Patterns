package builder;

import java.util.List;

public class Sandwich {
	
	private BreadType breadType;
	private MeatType meatType;
	private CheeseType cheeseType;
	private boolean hasMustard;
	private boolean isToasted;
	private List<String> vegtables;
	
	public Sandwich(){	
	}

	/**
	 * @return the breadType
	 */
	public BreadType getBreadType() {
		return breadType;
	}

	/**
	 * @param breadType the breadType to set
	 */
	public void setBreadType(BreadType breadType) {
		this.breadType = breadType;
	}

	/**
	 * @return the meatType
	 */
	public MeatType getMeatType() {
		return meatType;
	}

	/**
	 * @param meatType the meatType to set
	 */
	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}

	/**
	 * @return the cheeseType
	 */
	public CheeseType getCheeseType() {
		return cheeseType;
	}

	/**
	 * @param cheeseType the cheeseType to set
	 */
	public void setCheeseType(CheeseType cheeseType) {
		this.cheeseType = cheeseType;
	}

	/**
	 * @return the hasMustard
	 */
	public boolean isHasMustard() {
		return hasMustard;
	}

	/**
	 * @param hasMustard the hasMustard to set
	 */
	public void setHasMustard(boolean hasMustard) {
		this.hasMustard = hasMustard;
	}

	/**
	 * @return the isToasted
	 */
	public boolean isToasted() {
		return isToasted;
	}

	/**
	 * @param isToasted the isToasted to set
	 */
	public void setToasted(boolean isToasted) {
		this.isToasted = isToasted;
	}

	/**
	 * @return the vegetables
	 */
	public List<String> getVegetables() {
		return vegtables;
	}

	/**
	 * @param vegtables the vegetables to set
	 */
	public void setVegetables(List<String> vegtables) {
		this.vegtables = vegtables;
	}
	
	public void display(){
		if(isToasted){
			System.out.print("Toasted");
		}		
		System.out.print(this.getMeatType() + " Sandwich on " + this.breadType + " bread and " +  
				 "and " + this.getCheeseType() + " cheese on and ");
		for(String vegtable : vegtables )
		System.out.print(vegtable + " ");
		System.out.println();
		
	}
}
