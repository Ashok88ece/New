package Abstraction;

public class BMW extends car {
	
	public void enginesecret() {
		
		System.out.println("BMW engine secret");
	}
	
	public void companyvault() {
		
		System.out.println("BMW company vault");
	}
	
	public void carlaunch() {
		System.out.println("BMW Launched at 1916");
	}
	
	public void evehicle() {
		System.out.println("BMW EV launched at 2024");
	}

	public static void main(String[] args) {

      car car = new BMW();
      car.enginesecret();
      car.companyvault();
      car.carlaunch();
      car.evehicle();
      employees();
      

	}

}
