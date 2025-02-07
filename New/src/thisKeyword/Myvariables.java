package thisKeyword;

public class Myvariables {
	
	//Global Variables
	int x;
	int y;
	
	//Local Variables
	public Myvariables(int x,int y) {
		
		//Local variable x & y assigned to global variable
		//Without using this keyword then it will take by default global variables,Since it doesn't have any 
		//values so it will give "0" as a output
		//x=x;
		//y=y;
		this.x=x;
		this.y=y;
		
	}
	
	public void sum() {
		
		int sum=x+y;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myvariables obj = new Myvariables(10,50);
		obj.sum();
				
	}

}
