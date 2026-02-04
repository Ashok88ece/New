package javasample;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Java  programming  language ";
		
		String spaceremoved =  str.trim().replaceAll("\\s+", " ");
		
		System.out.println("Space Removed Content:"+spaceremoved);

	}

}
