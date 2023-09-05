package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class trycatchFinally {

	
	static String FILENAME="Read.txt";
	static BufferedReader br=null;
	static FileReader fr=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			String scurrentline;
			while((scurrentline=br.readLine())!=null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			
			try {
				if (br != null);
				br.close();
				if(fr!=null);
			
			
			fr.close();
			
			}
			
			catch (Exception e) {
			
				// TODO: handle exception
			
			e.printStackTrace();
			}
			}
		
	}

}
