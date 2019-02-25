package exception;
import java.util.Scanner;
import java.lang.Math;
public class Power {
 public static int power(int n,int p) throws Exception
{
	
	if(n < 0 || p < 0){
        throw new Exception ("n or p should not be negative.");
    } 
    else if (n == 0 && p == 0){
        throw new Exception ("n and p should not be zero.");
    }
    else {
        return ((int)Math.pow(n,p));
    }
	}
	
 
	
			
	
	//return  Math.pow(n,p);
 /*public static int power(int n, int p) throws Exception{
       
		
		if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        } 
        else if (n == 0 && p == 0){
            throw new Exception ("n and p should not be zero.");
        }
        else {
            return ((int)Math.pow(n,p));
        }
    }*/

	
	

public static void main(String[] args) throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the no of values");
	int n=sc.nextInt();
	int p =sc.nextInt();
	int bas[]=new int[n];
	int pow[]=new int[p];
	//System.out.println(powerex(n,p));
	System.out.println("enetr the base values");
	for (int i = 0; i < n; i++)
	{
	bas[i]=sc.nextInt();	
	}
	System.out.println("eneter the power values");
for (int i = 0; i <p; i++)
{
	pow[i]=sc.nextInt();
	
	
}
for (int i = 0; i < n; i++)
{
System.out.print(bas[i]+" ");
}System
.out.println();


for (int i = 0; i <p; i++)
{
	System.out.print(pow[i]+" ");
}
System.out.println();
if(n==p)
{

for (int i = 0; i < bas.length; i++)
{
	int res=power(bas[i],pow[i]);
	System.out.println(res);
}
}
else
{
	
	throw new Exception("the base and power elements are not same");
	
}
}
}
	


