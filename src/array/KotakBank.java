package array;
import java.util.Scanner;
public class KotakBank {
	public static void main(String[] args) {
		//long kotak[]=new long[4];
		
		Scanner sc=new Scanner(System.in);
		//long CustomerDetails[]=new long[1];
	   // int kotak=sc.nextInt();
		//int CustomerDetails =sc.nextInt();
		
        long[] CustDetails1=new long[4];
        
        for (int i = 0; i < CustDetails1.length; i++) {
       	 CustDetails1[i]=sc.nextLong();
        }
        
        long[] CustDetails2=new long[4];
        for (int i = 0; i < CustDetails2.length; i++) {
        	 CustDetails2[i]=sc.nextLong();
        	
			
		}
       
       /* CustDetails2[1]=sc.nextLong();
        CustDetails2[2]=sc.nextLong();
        CustDetails2[3]=sc.nextLong();*/
		/*long AccNo;
		long adhar;
		long balance;
        long phone;*/
        long kotak[][]=new long[2][];
        kotak[0]=CustDetails1;
        kotak[1]=CustDetails2;
		
		for (int i = 0; i < kotak.length; i++) {
			
				for (int j = 0; j < kotak[i].length; j++) {
					System.out.println(kotak[i][j]);
				}System.out.println();
	}

	}
}

