package exercise;
import java.util.Scanner;

public class Profile {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr L value");
		int L=sc.nextInt();
		System.out.println("enetr W value");
		int W=sc.nextInt();
		System.out.println("enetr H value");
		int H=sc.nextInt();
		if(W>=L&&H>=L)
		{
			if(W==H)
			{
				System.out.println("ACCEPTED");
			}
			else	
			{
			System.out.println("CROP IT");	
			}
		}
		else
		{
			System.out.println("UPLOAD ANOTHER");
		}
		
		
		
	}

}
