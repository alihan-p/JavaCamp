package lesson3_assignment2;

public class InstructorManager extends UserManager{
	public void addCourse (Instructor instructor) {
		System.out.println(instructor.getEmail() + "kullan�c�s� ders ekledi");
	}
}
