package Java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Audi","Benz","Hundai","Honda","MG","Maruthi"};
		
		cars[4]="Renault";
		
		System.out.println(cars[4]);
		
		System.out.println(cars.length);
		
		for(String str:cars) {
			System.out.println(str);
		}
		

	}

}
