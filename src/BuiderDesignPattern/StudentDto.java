package BuiderDesignPattern;

public class StudentDto {

	
	private int id;
	private String name;
	private String address;
	private String school;
	private String place;
	public StudentDto setId(int id) {
		this.id = id;
		return this;
	}
	public StudentDto setName(String name) {
		this.name = name;
		return this;
	}
	public StudentDto setAddress(String address) {
		this.address = address;
		return this;
	}
	public StudentDto setSchool(String school) {
		this.school = school;
		return this;
	}
	public StudentDto setPlace(String place) {
		this.place = place;
		return this;
	}
	
	public Student getStudent() {
		return new Student(id, name, address, school, place);
	}

}
