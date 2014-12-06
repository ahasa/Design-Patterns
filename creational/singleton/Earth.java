/**
 * Singleton pattern is one of the simplest design patterns in Java. 
 * This type of design pattern comes under creational pattern as this
 *  pattern provides one of the best way to create an object.
 *  
 *  This pattern involves a single class which is responsible to creates own object while making sure that only single object get created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 *  
 *  Implementation
 *  We're going to create a Earth class.
 *  Earth class have its constructor as private and have a static instance of itself.
 *  Earth class provides a static method to get its static instance to outside world.
 *  SingletonPatternDemo, our demo class will use SingleObjectInstance class to get a SingleObjectInstance object.
 */
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
