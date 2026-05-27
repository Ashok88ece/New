package ExceptionHandling;

public class nullpointer {

    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Null value cannot be accessed");
        }
        
        finally {
        	
        	System.out.println("Program continues...");
        }

        
    }
}