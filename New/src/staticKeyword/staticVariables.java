package staticKeyword;

public class staticVariables {
	
	static int amount;
	String depositedby;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticVariables object1 = new staticVariables();
		object1.amount=1000;
		object1.depositedby="Ashok";
		
		staticVariables object2 = new staticVariables();
		object2.amount=4500;
		object2.depositedby="Siddhu";
		
		System.out.println("Object1 integer:" +object1.amount);
		System.out.println("Object1 String :" +object1.depositedby);
		System.out.println("Object2 integer:" +object2.amount);
		System.out.println("Object2 String :" +object2.depositedby);
	}

}
