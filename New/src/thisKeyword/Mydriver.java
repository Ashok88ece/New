package thisKeyword;

public class Mydriver {
	
	
	public Mydriver() {
		this("Java");
		System.out.println("Loading My Driver");
	}
	
    public Mydriver(String name) {
		this(10);
		System.out.println("Loading My Driver - The Name is : "+name);
	}
    
    public Mydriver(int count) {
		
		System.out.println("Loading My Driver - The count is: "+count);
	}
    
    public void display() {
    	
    	System.out.println("I Am ashok");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mydriver obj1 = new Mydriver();
		//obj1.display();
		
	}

}
