package lesson2_assignment1;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName  + " ešitmen olarak eklendi");
		
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName  + " ešitmenlerden silindi");
		
	}

}
