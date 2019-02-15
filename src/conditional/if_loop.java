package conditional;
import java.util.Scanner;
public class if_loop {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			num+=10;
			
		}
		else
			num-=15;
		System.out.println(num);
	}
	
	

}
