package prototype;

import java.io.PrintStream;

public class StartUp {

	static PrintStream out = System.out;

	public static void main(String[] args) {
		StudentCache cache = new StudentCache();
		cache.loadCache();
		Student student = cache.getPerson("19840903");
		out.println(student.toString());
	}
}
