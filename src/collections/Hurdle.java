package collections;

import java.util.Scanner;

public class Hurdle {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of hurdles");
		int n=sc.nextInt();
		System.out.println("Enter maximum height");
		int h=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		System.out.println("enter the array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		if((max-h)>0)
		System.out.println("the no doses required :"+(max-h));
		else
			System.out.println(0);

	}
}
