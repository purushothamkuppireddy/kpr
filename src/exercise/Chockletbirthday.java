package exercise;
import java.util.Scanner;

public class Chockletbirthday {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no of students");
		int n=sc.nextInt();
		System.out.println("enter no of chocklet in packet that he bought");
		int l=sc.nextInt();
		
		if(l%n==0) {
			System.out.println("yes distributed equally5");
		}
		
		else
		{
			System.out.println("no");
		}
	}
	
	
}
