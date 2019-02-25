package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import wrapperEx.Student;
public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s=new Student();
		FileInputStream file = new FileInputStream("E:\\Programjava\\objectstream.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		s=(Student) obj.readObject();
		
		System.out.println(s.getName());
		System.out.println(s.getFees());
		System.out.println(s.getRoll()
				);
		
	}

}
