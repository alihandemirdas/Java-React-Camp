
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Dersi","Bu kurs ile Java uzman� olacaks�n�z.","Engin Demiro�","10$");
		
		Course course2 = new Course(2,"C# Dersi","Bu kurs ile C# uzman� olacaks�n�z.","Engin Demiro�","11$");
		
		Users user = new Users(1,"Alihan","Demirdas","alihan@mail.com","12345");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registerForCourse(user, course1);
		courseManager.registerForCourse(user, course2);
		
		courseManager.cancelForCourse(user, course1);
		courseManager.cancelForCourse(user, course2);
		
		
		
		

	}

}
