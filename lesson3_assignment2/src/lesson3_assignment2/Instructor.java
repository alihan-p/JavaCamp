package lesson3_assignment2;

public class Instructor extends User  {
	private String course;

	public Instructor(int id, String email, String password, String course) {
		super(id, email, password);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
