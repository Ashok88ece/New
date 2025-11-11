package MustKnownJavaConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UseFileWriter.txt";
		String Content  = "File Writing option";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(Content);
		
		filewriter.close();
		
		System.out.println("File Write Process Done");
		

	}

}
