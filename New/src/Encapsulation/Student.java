package Encapsulation;

public class Student {
	
	private String name;
	private int age;
	private String place;
	
	public String getName() {
		return name;
	}
	
	public String getPlace() {
		return place;
	}
	
    public int getage() {
		return age;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	public void setName(String newName) {
		this.name=newName;
		
	}
	
	public void setAge(int age) {
		this.age=age;
	}

}
