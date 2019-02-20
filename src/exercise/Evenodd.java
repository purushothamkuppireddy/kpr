package exercise;
import java.util.Arrays;
import java.util.Scanner;
public class Evenodd {
public static void evenodd(int[] arr)
{
	int count=0;
	for (int i = 0; i < arr.length; i++) 
	{
	if(arr[i]%2==0)
	{
	count++;	
	}
	}
	
	int m=(arr.length-count);
	int ev[]=new int[count];
	int od[]=new int[m];
	
	int j=0,k=0;
	for (int i = 0; i < arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			ev[j]=arr[i];
			j++;
		}
		else
		{
			od[k]=arr[i];
			k++;
		}
		
	}
	for (int i = 0; i < ev.length; i++) 
	{System.out.print(ev[i]+" ");
		
	}System.out.println();

	for (int i = 0; i < od.length; i++) 
	{
		System.out.print(od[i]+" ");
	
	}System.out.println();
  Arrays.sort(ev);
  Arrays.sort(od);
//System.out.println(ev.length);
//System.out.println(od.length);
int crr[]=new int[ev.length+od.length];
//System.out.println(crr.length);
for (int i = 0; i < ev.length; i++) 
{
	crr[i]=ev[i];
}

int p=ev.length;	
for (int l = 0; l < od.length; l++)
{
	crr[p]=od[l];
     p++;
} 


for (int l = 0; l < arr.length; l++)
{
	System.out.print(crr[l]+" ");
}


}






    

	
	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements ");
		for (int i = 0; i < arr.length; i++)
		{
		arr[i]=sc.nextInt();
		}
	evenodd(arr);
	}

}
