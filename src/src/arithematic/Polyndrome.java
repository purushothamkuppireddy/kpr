package arithematic;
import java.util.Scanner;
public class Polyndrome {
public static int reverse(int n) 
{
	//Scanner sc=new Scanner(System.in);
	int rem=0,rev=0;
	
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
	
		n=n/10;
	}
	
	return rev;
}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
     int x=sc.nextInt();
	if(reverse(x)==x)
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
}
}