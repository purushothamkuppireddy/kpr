package arrays;
import java.util.Scanner;
public class Diagonaladdtion {
	public static  int addresult(int mat[][],int x,int y)
	{
		int sum=0;
		int diff=0;
		
		
			for (int i = 0; i < x; i++) 
			{
			    for (int j = 0; j <y; j++) 
			    {
			    	
			    	if(i==j) 
			    	{
			    	sum=sum+mat[i][j];	
			    	}
			    }
			}
		
			
			for (int i = 0; i < x; i++) 
			{
			    for (int j = 0; j <y; j++) 
			    {
			    	
			    	if(i+j==y-1) 
			    	{
			    	diff=diff+mat[i][j];	
			    	}
			    }
			}
			
			
		return sum-diff;
			
			
			
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows and cols");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int cols=sc.nextInt();
       int mat[][]=new int[row][cols];
      // Diagonaladdtion a=new Diagonaladdtion();
    System.out.println("enter elements of matrix");
    
    
    for (int i = 0; i < row; i++) 
    {
	    for (int j = 0; j <cols; j++)
	    {
		   mat[i][j]=sc.nextInt();	
	     }
    }
    System.out.println("elements are..");
    for (int i = 0; i < row; i++) 
    {
	    for (int j = 0; j <cols; j++)
	    {
		  System.out.print(mat[i][j]+" ");	
	     }
	    System.out.println();
    } if(row==cols) 
	    {
       System.out.println("rtl="+addresult(mat,row,cols));
	    }
      
    else 
    {
    	System.out.println("plz enter equal row and cols ");
	
    }
    
	
	}
	
}
