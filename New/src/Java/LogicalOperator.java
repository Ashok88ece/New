package Java;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical &&(And) Operator -- Both Conditions return true we can use AND operator
		
		int x=4;
		
		System.out.println(x>2 && x<5);
		
		//Logical ||(OR) Operator - Any one condition return True then we can use OR operator
		
		int y=10;
		
		System.out.println(y>15 || y<5);
		
		//Logical (!)[Not] Reverse the result if result is True then it will be False
		
		int z =30;
		
		System.out.println(!(z>20 && z<31));

	}

}
