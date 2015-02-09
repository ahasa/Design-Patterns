package prototype;

import java.util.HashMap;

public class StudentCache {
	private HashMap<String, Student> cache = new HashMap<String, Student>();

	public Student getPerson(String personId) {
		Student student = cache.get(personId);
		return (Student) student.clone();
	}

	public void loadCache() {
		Student student1 = new Student("Ahmed", "Salem", "19840903");
		Student student2 = new Student("Robin", "Glimsjö", "19880801");
		Student student3 = new Student("Peter", "Magnusson", "19840119");
		cache.put(student1.getId(), student1);
		cache.put(student2.getId(), student2);
		cache.put(student3.getId(), student3);

	}
}
