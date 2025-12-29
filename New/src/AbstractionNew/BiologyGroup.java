package AbstractionNew;

public class BiologyGroup extends TwelvethStd {
	
	public void biologygroup() {
		System.out.println("Botany and Zoology Combined");
	}
	
	public void Sports() {
		System.out.println("Students allowed Occassionally");
	}
	
	public void Activity() {
		System.out.println("Mostly engaged with Lab activity");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwelvethStd obj = new BiologyGroup();
		obj.biologygroup();
		obj.Sports();
		obj.Activity();
		commongroup();

	}

	
}
