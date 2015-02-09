package singleton;

/**
 * @author Ahmed Salem
 *
 */
public class DataBaseSource {
	private static final DataBaseSource instance = new DataBaseSource();

	private DataBaseSource() {
	}

	public static DataBaseSource getInstance() {
		return instance;
	}

	public String getURL() {

		return "localhost:8080";
	}
}
