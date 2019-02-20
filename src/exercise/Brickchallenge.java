package exercise;
import java.util.Scanner;

public class Brickchallenge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no of bricks");
		int brick=sc.nextInt();
		int sum=0;
		//int total=0;
		//int p=0,m=0;
				for (int i = 1; i < brick; i++) 
		{
			
			sum=sum+i+i*2;
			//total=total+sum;
			
			if(sum>=brick)
			{
		//int x=(sum-i*2)%i;
				if(sum-i*2>brick)
				{
					System.out.println("patlu");break;
				}
				else
				{
					System.out.println("motu");break;
				}
			}
		
		
		}	
		
	}

}
