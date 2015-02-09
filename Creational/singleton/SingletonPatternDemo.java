package singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		DataBaseSource dataSource1 = DataBaseSource.getInstance();
		DataBaseSource dataSource2 = DataBaseSource.getInstance();

		String url1 = dataSource1.getURL();
		String url2 = dataSource2.getURL();
		System.out.println(url1.equals(url2));
		System.out.println(dataSource1.equals(dataSource2));

	}

}
