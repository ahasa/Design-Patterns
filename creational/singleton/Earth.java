package singleton;

import java.util.Date;

/**
 * @author Ahmed Salem
 *
 */
public class Earth {
	//create an object of Earth
	private static Earth instance = new Earth();
	
	//the constructor is private so that this class cannot be
	//instantiated
	private Earth() {
	}
	  
	//Get the only object available
	public static Earth getInstance() {
		return instance;
	}

	@SuppressWarnings("deprecation")
	public void getDateAndTime(){
		System.out.println("Current date & time on earth {:"+ new Date().toGMTString()+ "}");
	}
}
