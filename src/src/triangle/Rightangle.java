package triangle;
import java.util.Scanner;
import java.math.*;
public class Rightangle {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c==Math.sqrt(a*a+b*b)||a*a==(b*b+c*c)||b*b==(a*a+c*c))//pithorogous theorem
		{
			System.out.println("Yes it is right angled triangled");
		}
		else
		{
			
			System.out.println("No");
		}
		
		
		
	}

}
