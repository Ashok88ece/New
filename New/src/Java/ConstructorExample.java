package Java;

public class ConstructorExample {
	
	String make;
	String name;
	int year;
	
	public ConstructorExample() {
		this.make="Unknown";
		this.name="Unknown";
		this.year=2000;
		
	}
	
	public ConstructorExample(String make,String name,int year) {
		
		this.make=make;
		this.name=name;
		this.year=year;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample obj = new ConstructorExample();
		System.out.println("My Car:"+ obj.make +" " + obj.name + " " +obj.year);
		
		ConstructorExample obj1 = new ConstructorExample("Honda","Venue",1989);
		System.out.println("My Car: " +obj1.make+ " " +obj1.name+ " " +obj1.year);

	}

}
;
