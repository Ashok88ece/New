package JavaPrograms;

public class javastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello Java World";
		
		int length = str.length();
		System.out.println(" String Length: "+length);
		
		for(int i=0;i<str.length();i++) {
			
			System.out.print(str.charAt(i));
		}
		
		

	}

}
