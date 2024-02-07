package assignmentassignment1;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingCourse implements OnlineCourse{

	private String courseName;
	private String instructorName;
	private List<String> enrolledStudent;
	
	public ProgrammingCourse(String courseName, String instructorName) {
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.enrolledStudent = new ArrayList<>();
		
	}



	@Override
	public void enrollStudent(String studentName) {
		enrolledStudent.add(studentName);
	}

	@Override
	public void displayCourseDeteiles() {
		System.out.println("course name is: " + courseName);
		System.out.println("course instructoe is: " + instructorName);
		System.out.println("Enrolled students are: ");
		for (String student : enrolledStudent) {
			System.out.println("- " + student);
		}
		

	}
}
