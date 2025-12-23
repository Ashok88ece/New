package Java;

public class Palindrome {
	public static void main(String[] args) {

		String str = "aya";
		String rev = new StringBuffer(str).reverse().toString();
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}