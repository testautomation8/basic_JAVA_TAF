import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling {

	public static void main(String[] args) throws IOException {
		
		String file= System.getProperty("user.dir") + "\\TestFile";
		int ch;
		//System.out.println(file);
		
		try {
			
			FileReader fr = new FileReader(file);
			
		while ((ch=fr.read()) !=-1)
			System.out.print((char)ch); 
		  
        // close the file 
        fr.close(); 
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
