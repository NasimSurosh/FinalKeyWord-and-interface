package assignmentassignment1;

import java.util.ArrayList;
import java.util.List;

public class MathCourse implements OnlineCourse {
	private String courseName;
	private String courseInstructor;
	private List<String> enrolledStudent;

	public MathCourse(String courseName, String courseInstructor) {
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.enrolledStudent = new ArrayList<>();
	}

	@Override
	public void enrollStudent(String studentName) {
		enrolledStudent.add(studentName);
	}

	@Override
	public void displayCourseDeteiles() {
		System.out.println("course name is: " + courseName);
		System.out.println("course instructor is: " + courseInstructor);
		System.out.println("enrolled students are: ");
		for (String student: enrolledStudent) {
			System.out.println("- " + student);
		}

	}

}
