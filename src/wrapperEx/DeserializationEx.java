package wrapperEx;

import java.io.*;

//import files.ObjectOutputStream;

public class DeserializationEx {

	public static void main(String[] args) {
		
		try
		{
			
		
		FileInputStream file = new FileInputStream("E:\\Programjava\\objectstream.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		Student s=(Student)obj.readObject();
		s.setRoll(123);
		s.setFees(1234);
		
	System.out.println(s.getName()+" "+s.getRoll()+" "+s.getFees());
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
		
		
		
	}

