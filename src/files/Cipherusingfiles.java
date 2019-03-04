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

//public static int getmessage()

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		StringBuilder message=new StringBuilder();
		try {
			
			
			FileOutputStream f1 = new FileOutputStream("E:\\Programjava\\demo.txt");
			System.out.println("Enetr key");
			int n=sc.nextInt();
			f1.write(n);
			f1.close();
			
			FileOutputStream f2 = new FileOutputStream("E:\\Programjava\\demo1.txt");
			System.out.println("Enetr message");
			String s1=sc.next();
			byte[]b=s1.getBytes();
			f2.write(b);
			f2.close();
		
			FileInputStream file1=new FileInputStream("E:\\programjava\\demo.txt");
			FileInputStream file2=new FileInputStream("E:\\programjava\\demo1.txt");
			StringBuilder str=new StringBuilder();
			int i;
			while((i=file2.read())!=-1)
			{
				//System.out.print((char)i);
				
				
				str.append((char)i);
				
			}
			String str2=str.toString();
			System.out.println(str2);
			
			FileOutputStream f3= new FileOutputStream("E:\\Programjava\\encmsg.txt");
			String s5;
			s5=(encryption(str2,file1.read())).toString();
			byte[]b1=s5.getBytes();
			f3.write(b1);
			f3.close();
			
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
	
	
	

