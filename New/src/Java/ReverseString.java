package Java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ashokkumar";
		
		StringBuffer sbr = new StringBuffer(str);
		
		sbr.reverse();
		
		System.out.println("String Given is:"+str);
		System.out.println("Reversed String is :"+sbr);

	}

}
