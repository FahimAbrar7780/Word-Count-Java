package batch13pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class readDataAndCountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Path path=Paths.get(System.getProperty("user.dir"))
    		   .resolve("input.txt");
       BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader(path.toFile()));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       Map<String,Integer>frequency=new HashMap<>();
       String line = null;
	try {
		line = reader.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       while(line !=null) {
    	   System.out.println(line);
    	   if(!line.trim().equals("")) {
    		   String [] words=line.split(" ");
    		   for( String word : words) {
    			   String convertdWord=word.toLowerCase();
    			   convertdWord=convertdWord.replace(".", "");
    			   if(frequency.containsKey(convertdWord)) {
    				   frequency.put(convertdWord,frequency.get(convertdWord)+1);
    			   }
    			   else {
    				   frequency.put(convertdWord, 1);
    			   }
    		   }
    	   }
    	   try {
			line=reader.readLine();
			System.out.print(frequency);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
       }
	}

}
