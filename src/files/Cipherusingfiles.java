package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cipherusingfiles {

public static StringBuilder encryption(String message,int key)	
{
	char[] letters=message.toCharArray();
	StringBuilder encmsg=new StringBuilder();
for (int i = 0; i < letters.length; i++) 
{
	encmsg.append((char)(byte)(letters[i]+key));
	
	
}
	System.out.println(encmsg);
	return encmsg;

}
public static void decryption(StringBuilder encmsg)
{
	String msg=encmsg.toString();
	char[] letters= msg.toCharArray();
	StringBuilder dcmsg=new StringBuilder();
	for (int i = 0; i < letters.length; i++) 
	{
		dcmsg.append((char)(byte)(letters[i]-3));
		
		
	}
	System.out.println(dcmsg);

}

public static int geemessage

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//decryption(encryption("Hello-",3));
		StringBuilder message=new StringBuilder();
		try {
			
			
			FileOutputStream f1 = new FileOutputStream("E:\\Programjava\\demo.txt");
			System.out.println("Enetr integer");
			//String n=sc.next();
			int n=sc.nextInt();
			//byte[]b=n.getBytes();
			f1.write(n);
			f1.close();
			
			FileOutputStream f = new FileOutputStream("E:\\Programjava\\demo1.txt");
			System.out.println("Enetr name");
			String n=sc.next();
			
			
			//int n=sc.nextInt();
			byte[]b=n.getBytes();
			f.write(b);
			f.close();
		
			
			
			FileInputStream f1=new FileInputStream("E:\\programjava\\demo1.txt");
			FileInputStream f2=new FileInputStream("E:\\programjava\\demo.txt");
			
			int i;
			while((i=f1.read())!=-1)
			{
				System.out.print((char)i);
				encryption((char)i,f2.read());
			}
			f1.close();
			f2.close();		
			}

		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
	
	
	

