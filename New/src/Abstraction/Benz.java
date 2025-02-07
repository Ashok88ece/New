package Abstraction;

public class Benz extends car {
	
	public void enginesecret() {
		
		System.out.println("Benz engine secret");
	}
	
	public void companyvault() {
		
		System.out.println("Benz company vault");
	}

	public static void main(String[] args) {
		
      car car = new Benz();
      car.enginesecret();
      car.companyvault();
	}

}
