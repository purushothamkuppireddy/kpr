package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void merge(int arr[],int brr[])
	{
		//Arrays.sort(arr);
		//Arrays.sort(brr);
		int crr[]=new int[arr.length+brr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			crr[i]=arr[i];
		}
		
		int i=arr.length;	
		for (int j = 0; j < brr.length; j++)
		{
			
		
			crr[i]=brr[j];
		     i++;
		     
		}
		//break;
			
		
		//Arrays.sort(crr);
		for (int k = 0; k < crr.length; k++)
		{
			System.out.print(crr[k]+" ");
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr 1st size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements ");
		for (int i = 0; i < arr.length; i++)
		{
		arr[i]=sc.nextInt();
		}	
		//Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr 2nd size");
		int m=sc.nextInt();
		int brr[]=new int[m];
		System.out.println("enter elements ");
		for (int i = 0; i < brr.length; i++)
		{
		brr[i]=sc.nextInt();
		}
merge(arr,brr);
	}

}
