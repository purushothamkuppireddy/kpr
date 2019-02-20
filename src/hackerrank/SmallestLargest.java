package hackerrank;
import java.util.Scanner;
import java.util.Arrays;
public class SmallestLargest {
 
public static void smallest( int k,int[] arr)
{
	Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) 
{
	if(k==i+1)
	{
	System.out.println(arr[i]);	
	}
}
}
	
public static
void largest(int k,int[] arr)
{
	Arrays.sort(arr);
	/*for (int i = 0; i < arr.length; i++) 
	{
		if(k==i+1)
		{
			
			int x=(abs(arr.length-k));
		System.out.println(arr[x]);	
		}
	}*/
	System.out.println(arr[arr.length-k]);
	}


	
	

	
	
	private static int abs(int i) {
	// TODO Auto-generated method stub
	return 0;
}

	public static void main(String[] args)
	{
		
   Scanner sc=new Scanner(System.in);
   System.out.println("enter no.of elements");
	int n=sc.nextInt();
	System.out.println("enetr at which element");
	int k=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array");
	for (int i = 0; i < arr.length; i++)
	{
	arr[i]=sc.nextInt()	;
	}
	//
	
	smallest (k,arr);

	largest(k,arr);
	}

}
