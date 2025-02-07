package Abstraction;

public class BMW extends car {
	
	public void enginesecret() {
		
		System.out.println("BMW engine secret");
	}
	
	public void companyvault() {
		
		System.out.println("BMW company vault");
	}

	public static void main(String[] args) {

      car car = new BMW();
      car.enginesecret();
      car.companyvault();
      

	}

}
