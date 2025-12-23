package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ashokkumar";
		
		StringBuilder string = new StringBuilder(str);
		
		string.reverse();
		
		System.out.println("Given String:"+str);
		System.out.println("Reversed String:"+string);

	}

}
