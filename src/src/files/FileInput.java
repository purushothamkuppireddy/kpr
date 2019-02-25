package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
		
	FileInputStream f=new FileInputStream("E:\\programjava\\demo.txt");
	
	
	System.out.println(f.read());
	f.close();
			
	}

catch(FileNotFoundException e) {
	e.printStackTrace();
	
}catch(IOException e)
{
	e.printStackTrace();
}

}
}

