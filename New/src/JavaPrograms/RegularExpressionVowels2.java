package JavaPrograms;

public class RegularExpressionVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi Hello How Old are YOu";
		
		String lowercase = str.toLowerCase();
		
		String vowelsonly = lowercase.replaceAll("[^aeiouAEIOU]", "");
		
		System.out.println("Original String: "+str);
		System.out.println("Vowels Only:"+vowelsonly);

	}

}
