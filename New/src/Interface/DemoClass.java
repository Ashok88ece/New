package Interface;

/*Like abstract classes, interfaces cannot be used to create objects 
 * (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
*/

public class DemoClass implements FirstInterface,SecondInterface {
	
	public void firstmethod() {
		
		System.out.println("Call First Interface Method");
	}
	
	public void secondmethod() {
		System.out.println("Call Second Interface Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoClass obj = new DemoClass();
		obj.firstmethod();
		obj.secondmethod();

	}

}
