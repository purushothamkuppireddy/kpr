package files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import wrapperEx.Student;
public class SerializationEx {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("bob");
		s.setRoll(123);
		s.setFees(1234);
		try
		{
			
		
		FileOutputStream file = new FileOutputStream("E:\\Programjava\\objectstream.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(s);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e)
			{
			e.printStackTrace();
			}
		
		System.out.println("Done");
		
	}

}
