package batch13pack;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="I am fahim.I love Java";
		try (FileWriter output = new FileWriter("input.txt")) {
			output.write(data);
		  System.out.println("Data is written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		

	}

}
