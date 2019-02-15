package array;
import java.util.Scanner;
public class SinleD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1D
		int a[]=new int[5];
		int num;
		//a[2]=10;
		//a[4]=23;
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the number");
			num=sc.nextInt();
			a[i]=num;
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			
		}                                           
		//2D
		
		System.out.println("enter the rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int b[][]=new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("enter the numbers");
				num=sc.nextInt();
				b[i][j]=num;
				
				
			}
		}	
		System.out.println("here the values");	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
