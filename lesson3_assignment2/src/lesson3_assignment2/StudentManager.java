package lesson3_assignment2;

public class StudentManager extends UserManager {
	public void envolveCourse(Student student) {
		System.out.println(student.getEmail() + "kullanıcısı kursa kayıt edildi!");
	}
}
