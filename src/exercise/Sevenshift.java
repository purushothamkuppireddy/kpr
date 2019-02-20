package exercise;
import java.util.Scanner;
public class Sevenshift {
public static void right(int[] arr)
{
	int temp;
	//int brr[]=new int[arr.length];
	for (int i = 0; i < arr.length-1; i++) {
	for (int j = i+1; j <arr.length;j++) {
	
		if(arr[i]==7)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
				}
	}
	
	
	
	for (int i = 0; i < arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}
	
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enetr size");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter elements that contains 7");
	for (int i = 0; i < arr.length; i++)
	{
	arr[i]=sc.nextInt();
	}
	
        right(arr);
		
		
	}

}
