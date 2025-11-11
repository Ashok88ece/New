package MustKnownJavaConcepts;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File obj = new File("filename.txt");
		
		try {
			if(obj.createNewFile()) {
				System.out.println("get File Name"+obj.getName());
			}
			
			else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
