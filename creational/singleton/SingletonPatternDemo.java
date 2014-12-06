package singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
	     
		//Get the only object available
		Earth earth = Earth.getInstance();
		
		// Show the date and time
		earth.getDateAndTime();
		
	}

}
