package prototype;

public class Student implements Cloneable {

	private String firstName;
	private String lastName;
	private String id;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getId() {
		return this.id;
	}

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.err.println(ex.getStackTrace());
		}

		return clone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FirstName : " + this.firstName + "\n");
		builder.append("LastName : " + this.lastName + "\n");
		builder.append("Id : " + this.id + "\n");
		return builder.toString();
	}
}
