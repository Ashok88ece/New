package multilevelInheritance;

public class employee extends admin {
	
	public void employee() {
		
		System.out.println("Child : Employee have some limited access");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee obj = new employee();
		obj.sradmin();
		obj.admin();
		obj.employee();

	}

}
