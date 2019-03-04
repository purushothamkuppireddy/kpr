
package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filenameinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
		
	FileInputStream f=new FileInputStream("E:\\programjava\\demo1.txt");
	
	int i;
	while((i=f.read())!=-1)
	{
		System.out.print((char)i);
	}
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
