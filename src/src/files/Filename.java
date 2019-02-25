package files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Filename {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				try {
					FileOutputStream f = new FileOutputStream("E:\\Programjava\\demo1.txt");
			System.out.println("Enetr name");
			String n=sc.next();
			//int n=sc.nextInt();
			byte[]b=n.getBytes();
			
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
		
				
				
	}

}
