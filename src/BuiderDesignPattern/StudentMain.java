package BuiderDesignPattern;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student=new StudentDto().setId(1).setName("Krishnaraddi").setSchool("JC").setAddress("GaduginaBharatha").getStudent();
		System.out.println(student);
		
	}

}
