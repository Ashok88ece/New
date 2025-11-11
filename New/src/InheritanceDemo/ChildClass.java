package InheritanceDemo;

public class ChildClass extends BaseClass{

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();//child class reference and child class object hold both parent and child class methods
		//BaseClass obj = new ChildClass();//Base class ref and child class obj only hold base class methods not on child class methods
		//BaseClass obj =new BaseClass();//Base class ref and base class object hold only parent class methods
		//ChildClass obj= new BaseClass();//This scenario not possible bcs base class object cannot hold parent class methods
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

	}
	
	public void mul() {
		
		System.out.println("I am in Child class and mul is 3000");
	}
 
	public void div() {
		
		System.out.println("I am in child class and div is 20");
	}
}
