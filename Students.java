package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("\nStudent ID: "+id);
		System.out.println("Student NAme: "+name);
	}
	
	public void getStudentInfo(String email, long phnNo) {
		System.out.println("\nEmail id of Student: "+email);
		System.out.println("PhoneNo of Student: "+phnNo);
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		//Calling getStudentInfo method by passing single argument ID
		stud.getStudentInfo(1786);
		
		//Calling getStudentInfo method by passing arguments ID and name
		stud.getStudentInfo(1786, "Shiva");
		
		//Calling getStudentInfo method by passing arguments ID and name
		stud.getStudentInfo("abc@gamil.com", 9865368286l);

	}

}
