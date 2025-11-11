package Java;

public class MethodParameters {
	
	static void mymethod(String fname) {
		System.out.println(fname + "Kumar");
	}
	
	static void mymethod2(String fname,int age) {
		System.out.println(fname +" is " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod("Ashok");
		mymethod("Varun");
		mymethod("Arun");
		mymethod2("Ashok",37);
		mymethod2("Gowdham",38);
		mymethod2("Gokuk",35);

	}

}
