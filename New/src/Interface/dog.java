package Interface;

public class dog implements animal {
	
	public void animalsound() {
		
		System.out.println("Dog is Barking");
	}

	public void animalnature() {
		System.out.println("Friendly nature with Humans");
	}
	public static void main(String[] args) {
		
		animal obj=new dog();
		obj.animalsound();
		obj.animalnature();
		
		

	}

}
