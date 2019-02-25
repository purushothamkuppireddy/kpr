package files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileOutputs {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
				/*try {
					FileOutputStream f = new FileOutputStream("E:\\Programjava\\demo.txt");
			System.out.println("Enetr integer");
			//String n=sc.next();
			int n=sc.nextInt();
			//byte[]b=n.getBytes();
			f.write(n);
			f.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				catch (IOException e)
				{
					e.printStackTrace();
				}*/
		FileOutputStream f = new FileOutputStream("E:\\Programjava\\demo.txt");	
		int n=sc.nextInt();
		//byte[]b=n.getBytes();
		f.write(n);
		f.close();
	
	}

}
