package Java;

public class ClassMethod {
	
	public void fullthrottle() {
		System.out.println("The Car going as much speed as can possible speed!");
	}
	
	public void speed(int speed) {
		System.out.println("Car Maximum Speed is :"+speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassMethod obj = new ClassMethod();
		obj.fullthrottle();
		obj.speed(200);

	}

}
