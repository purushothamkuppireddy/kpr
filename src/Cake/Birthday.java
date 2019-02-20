package Cake;
import java.util.Arrays;
import  java.util.Scanner;

public class Birthday {
static int birthdayCakeCandle(long[] arr)
{
	
	int count=0;
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) 
	{
		
		if(arr[i]>=arr[arr.length-1])
		{
		count++;	
		}
	
	}
	
	return count;
}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("");
		long candle[]=new long[age];
	  for (int i = 0; i < candle.length; i++) 
	  {
		candle[i]=sc.nextInt();
		
	   }
	  int blow=birthdayCakeCandle(candle);
	  System.out.println(blow);
	}
	
	
}

