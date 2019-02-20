package exercise;
import java.util.Scanner;
public class Stringconcat {

	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3;
		//int a=s1.length();
		//int b=s2.length();
		
		//concat(s1,s2);
		//char[] ch=new char[20]; 
		char[] letters1=s1.toCharArray();
		char[] letters2=s2.toCharArray();
		char[] ch=new char[letters1.length+letters2.length];
		/*	int i=0;
			int j=0;
			int k=1;
	for (int l = 0; l < letters1.length; l+=2)
		{
			ch[l]=letters1[i];
			ch[k]=letters2[j];
			i++;
			j++;
			k+=2;
		}*/
		int j=0;
		for (int i = 0; i < letters1.length*2; i+=2) 
		{
			
			ch[i]=letters1[j];
			j++;
			
		}
		int k=0;
		for (int i = 1; i < letters1.length*2; i+=2) 
		{
			ch[i]=letters2[k];
			k++;
		}
		
		int l=letters1.length;
		for (int i = letters1.length*2; i <ch.length; i++)
		{
			ch[i]=letters2[l];
			l++;
		}
		
		
		StringBuilder msg=new StringBuilder();
		for (int n = 0; n < ch.length; n++) 
		{
			msg.append((char)(ch[n]));
			
			
		}
		
		
		System.out.println(ch);

		
	}

}
