package hackerrank;
import  java.util.Scanner;
public class Appleorange {

	static void CountAO(int s, int t,int a,int b,int[] apple,int[] orange)
	{
		int c1=0;
		int c2=0;
		for (int i = 0; i < apple.length; i++) 
		{
			if((s-a)<=apple[i]&&(t-a)>apple[i])
			{
			c1++;	
			}
			
		}
		
		for (int i = 0; i < orange.length; i++) 
		{

			if((t-b)>=orange[i]&&(s-b)<=orange[i])
			{
			c2++;	
			}
			
		}
		
		System.out.println("no of apples on the house"+ c1);
		System.out.println("no of oranges on the house"+ c2);
		
		
		
	}
	
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("s");
		int s=sc.nextInt();
		System.out.println("t");
		int t=sc.nextInt();
		System.out.println("a");
		int a=sc.nextInt();
		System.out.println("b");
		int b=sc.nextInt();
		System.out.println("m");
		int m=sc.nextInt();
		System.out.println("n");
		int n=sc.nextInt();
		int apple[]=new int[m];
		int orange[]=new int[n];
		System.out.println("apple distance");
		for (int i = 0; i < apple.length; i++) 
		{
			apple[i]=sc.nextInt();
			
		}
		System.out.println("orange distance");
		for (int i = 0; i < orange.length; i++) 
		{
			orange[i]=sc.nextInt();
			
		}
		
		CountAO(s,t,a,b,apple,orange);
		
	}
	
	
}


