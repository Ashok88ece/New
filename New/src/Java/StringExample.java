package Java;

public class StringExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Greetings";
		System.out.println(text);
		
		String txt1="HelloWorldHowAreYouIamAshok";
		System.out.println("Length of the String is:"+txt1.length());
		
		String txt2 = "HELLOASHOKKUMAR";
		System.out.println("Convert to LowerCase:"+txt2.toLowerCase());
		
		String txt3 = "helloashokkumar";
		System.out.println("Convert to UpperCase:"+txt3.toUpperCase());
		
		String txt4= "Please locate the 'adyar' at chennai";
		System.out.println(txt4.indexOf("adyar"));
		
		String txt5="Hello";
		System.out.println(txt5.charAt(0));
		System.out.println(txt5.charAt(4));
		
		//String Comparison
		
		String txt6="Hello";
		String txt7="Hello1";
		
		System.out.println(txt6.equals(txt7));
		
		//Removing White Space
		
		String txt8 = " Hello World ";
		
		System.out.println("Before : [" + txt8 + "]" );
		System.out.println("After : ["+ txt8.trim()+ "]");
		
		//String Concatination
		
		String fname="Ashok";
		String lname="kumar";
		System.out.println(fname.concat(lname));
		
		String fname1="Ashok";
		String lname1="Kumar";
		String mname1="Gandhi";
		
		System.out.println(fname1.concat(lname1).concat(mname1));
		
		

	}

}
