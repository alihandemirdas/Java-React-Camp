
public class CourseManager {
	
	public void registerForCourse(Users user, Course course) {
		
		System.out.println("Merhaba " + user.name + "! "+ course.courseName + " kursuna kayd�n ba�ar�yla olu�turuldu." );
	}
	
	public void cancelForCourse(Users user, Course course) {
		
		System.out.println("Merhaba " + user.name + "! "+ course.courseName + " kursundan kayd�n silindi :(");
	}
	
	
}
