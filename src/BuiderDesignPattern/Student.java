package BuiderDesignPattern;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private String school;
	private String place;
	
	
	public Student(int id, String name, String address, String school, String place) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.school = school;
		this.place = place;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getSchool() {
		return school;
	}
	public String getPlace() {
		return place;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", school=" + school + ", place="
				+ place + "]";
	}
	
	

}
