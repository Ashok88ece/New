package JavaPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Java  Programming  ";
		
		//String result = str.replace(" ","");
		
		String result = str.trim().replaceAll("\\s+"," ");
		
		System.out.println("After Space Removed:"+result);

	}

}
