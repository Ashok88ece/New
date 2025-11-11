package Java;

public class MethodOverloading {
	
	
	public void add(int a,int b) {
		
		System.out.println("Addition of Two Parameter:"+(a+b));
		
	}
	
	public void add(int a,int c,int b) {
		System.out.println("Addition of Three Parameter:"+(a+c+b));
	}
	
	public void add(double a,double b) {
		System.out.println("Addition of Two double paramter:"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(5, 10);
		obj.add(5, 10, 20);
		obj.add(12.5, 10.25);

	}

}
