package javasample;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "level";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrome:"+rev);
		}
		
		else {
		 System.out.println("Given String is not a Palindrome");
		}

	}

}
