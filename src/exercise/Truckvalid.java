package exercise;
import java.util.Scanner;
public class Truckvalid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the tag of format DDXDDD-DD");
		String s1=sc.next();
		char[] ch=s1.toCharArray();
		/*int a[]=new int[9];
		for (int i = 0; i <2; i++) 
		{
			a[i]=Character.getNumericValue(ch[i]);
		
		}
		for (int i = 3; i <=5; i++) 
		{
			a[i]=Character.getNumericValue(ch[i]);

		}
		for (int i = 7; i <=8; i++) 
		{
			a[i]=Character.getNumericValue(ch[i]);

		}

		
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			if(i==2||i==6)
			{
				continue;
			}
			if((a[i]+a[i+1])%2==0)
			{
				
			}	
			}*/
		if(ch[2]=='A'||ch[2]=='E'||ch[2]=='I'||ch[2]=='O'||ch[2]=='U'||ch[2]=='Y')
		{
			System.out.println("not valid");
		}
			
		
		else
		{
			if((Character.getNumericValue(ch[0])+ Character.getNumericValue(ch[1]))%2==0&&(Character.getNumericValue(ch[3])+Character.getNumericValue(ch[4]))%2==0&&(Character.getNumericValue(ch[4])+Character.getNumericValue(ch[5]))%2==0&&(Character.getNumericValue(ch[7])+Character.getNumericValue(ch[8]))%2==0)
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("not valid");
			}	
		}
		

	}

}
