
package arraylist;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class FiletoArraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List al =new ArrayList();
		
	try {
		FileOutputStream f = new FileOutputStream("E:\\Programjava\\arraylist.txt");
System.out.println("Enetr number string");
String st=sc.next();
//int n=sc.nextInt();
byte[]b=st.getBytes();
f.write(b);
f.close();
}
catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
	catch (IOException e)
	{
		e.printStackTrace();
	}

	try {
		
		
		FileInputStream f=new FileInputStream("E:\\programjava\\arraylist.txt");
		int i;
		while((i=f.read())!=-1)
		{
		if(i!='-')
		{
			al.add((char)i);
		}
		}
		f.close();
		System.out.println(al);
				
		}

	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}catch(IOException e)
	{
		e.printStackTrace();
	}

		
	}

}
