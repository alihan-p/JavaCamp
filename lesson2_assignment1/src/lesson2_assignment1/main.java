package lesson2_assignment1;

public class main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C#", "C# Kursu");
		Course course2 = new Course(1, "Java", "Java Kursu");
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.courseName + " -> "+ course.courseDescription);
		}
		
		System.out.println("--------------------");
		
		Instructor instructor1 = new Instructor(1, "Alihan", "Polat");
		Instructor instructor2 = new Instructor(2, "Ahmet", "Aydýn");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.firstName);
		}
		
		System.out.println("--------------------");
		
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			courseManager.add(course);
		}
		
		System.out.println("--------------------");
		
		for (Course course : courses) {
			courseManager.delete(course);
		}
		
		System.out.println("--------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
		}
		
		System.out.println("--------------------");
		
		for (Instructor instructor : instructors) {
			instructorManager.delete(instructor);
		}
	}

}
