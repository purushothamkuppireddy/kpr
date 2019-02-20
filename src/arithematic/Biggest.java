package arithematic;
import java.util.Scanner;
public class Biggest {
 public static void  biggest(double[] arr)
 {
	double sum=0; 
	 
	 for (int i = 0; i < arr.length; i++)
	 {
		sum=sum+arr[i];
		 
	}
	 double avg=sum/arr.length;
	 for (int i = 0; i < arr.length; i++) 
	 {
		
		 if(arr[i]>avg)
		 {
			 System.out.println(arr[i]+" is the biggest number");
		 }
	}
	 
	 
 }
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
         System.out.println("enter array size");
         int n=sc.nextInt();
		double arr[]=new double[n];
		for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
		}
    biggest(arr);
	}

}
