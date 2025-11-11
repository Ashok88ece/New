package Abstraction;

public class Benz extends car {
	
	public void enginesecret() {
		
		System.out.println("Benz engine secret");
	}
	
	public void companyvault() {
		
		System.out.println("Benz company vault");
	}
	
	public void carlaunch() {
		System.out.println("Benz Launched at 1926");
	}
	
	public void evehicle() {
		System.out.println("Benz EV launched at 2024");
	}

	public static void main(String[] args) {
		
      car car = new Benz();
      car.enginesecret();
      car.companyvault();
      car.carlaunch();
      car.evehicle();
      employees();
	}

}
