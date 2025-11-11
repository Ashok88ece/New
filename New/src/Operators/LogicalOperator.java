package Operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean booleanval1 = true;
		boolean booleanval2 = false;
		
		//&& And Operator
		
		System.out.println("Output of AND Operator:"+(booleanval1&&booleanval2));
		
		//|| OR operator
		
		System.out.println("Output of OR Operator:"+(booleanval1||booleanval2));
		
		// ! Not Operator
		
		System.out.println("Output of Not Operator:"+(!booleanval1));

	}

}
