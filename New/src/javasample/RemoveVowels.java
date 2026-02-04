package javasample;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Hi How are you";
		
		String lowercase = str.toLowerCase();
		
		for(int i=0;i<lowercase.length();i++) {
			
			char ch = lowercase.charAt(i);
			
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
				
				System.out.print(" "+ch);
			}
		}

	}

}
