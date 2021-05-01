package lesson3_assignment2;

public class Main {

	public static void main(String[] args) {
		Student alihan = new Student(1, "alihan_polat@hotmail.com", "1234", "Java");
		Instructor engin = new Instructor(2, "engindemirog@gmail.com", "1234", "C#, Java, Angualar");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		User[] users = {alihan, engin};
		
		for (User user : users) {
			userManager.Add(user);
		}
		
		for (User user : users) {
			userManager.Delete(user);
		}
		
		studentManager.envolveCourse(alihan);
		instructorManager.addCourse(engin);
		
		
		
		

	}

}
