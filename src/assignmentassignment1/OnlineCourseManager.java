package assignmentassignment1;

import java.util.ArrayList;
import java.util.List;

class CourseManager {
	private List<OnlineCourse> courses;

	public CourseManager() {
		courses = new ArrayList<>();

	}

	public void addCourses(OnlineCourse course) {
		courses.add(course);
	}

	public void enrollStudentInCourse(String studentName, OnlineCourse course) {
		course.enrollStudent(studentName);
	}

	public void displayAll() {
		for (OnlineCourse cours : courses) {
			cours.displayCourseDeteiles();
			System.out.println();
		}
	}
}

public class OnlineCourseManager {

	public static void main(String[] args) {
		
		CourseManager  manager = new CourseManager();
	
		
		OnlineCourse programm = new ProgrammingCourse("LLC", "Alica");
		OnlineCourse math = new MathCourse("FBC", "Kamil");
		
		programm.enrollStudent("Ania");
		programm.enrollStudent("Karim");
		programm.displayCourseDeteiles();
		
		math.enrollStudent("bahram");
		math.enrollStudent("Tania");
		math.displayCourseDeteiles();
		
		manager.addCourses(math);
		manager.addCourses(programm);
		
		manager.enrollStudentInCourse("Alia", math);
		manager.enrollStudentInCourse("Firoz", programm);
		manager.displayAll();
	}

}
