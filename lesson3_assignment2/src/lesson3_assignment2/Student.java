package lesson3_assignment2;

public class Student extends User {
	private String envolvedCourse;

	public Student(int id, String email, String password, String envolvedCourse) {
		super(id, email, password);
		this.envolvedCourse = envolvedCourse;
	}

	public String getEnvolvedCourse() {
		return envolvedCourse;
	}

	public void setEnvolvedCourse(String envolvedCourse) {
		this.envolvedCourse = envolvedCourse;
	}
	
}
