package arrays;
import java.util.Scanner;

public class OneD {

	private static Scanner x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int temp;
int arr[] =new int[10];
 Scanner x = new Scanner(System.in);
for (int i = 0; i < arr.length; i++) 
{
	arr[i]=x.nextInt();
}
/*for (int i = 0; i < arr.length; i++) 
{
	for (int j = i; j < arr.length-1; j++)
	{
	if(arr[j]>arr[j+1])
	{
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
			
	}	
		
		
	}
}*/

for (int i = 0; i < arr.length; i++) 
{
	System.out.println(arr[i]);

	}

}
}

