package hackerrank;
import java.util.Scanner;
public class Plusminus {

	public static void plmns(int[] arr,int y)
	{
		
	double count1=0;
		double count2=0;
		double count3=0;
		
		double r1,r2,r3;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<0)
					{
			count1++;
			
					}
			else if(arr[i]==0)
			{
				count2++;	
			}
	
			else if(arr[i]>0)
			{
				count3++;
			}
		
		}
		r1=count1/y;
		r2=count2/y;
		r3=count3/y;
		System.out.println(r1);
		
		System.out.println(r2);

		System.out.println(r3);

		}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(); 
		int g;
		int ar[]=new int[x];
		for (int i = 0; i < ar.length; i++)
		{
		 g= sc.nextInt();
		 ar[i]=g;
		 
		 
		}
		plmns(ar,x);
		
		
	}
	
	
}
