package basic;
import java.util.*;

public class Formatprint {

    // Complete the staircase function below.
    static void staircase(int n) {
// for(int i=1;i<=n;i++)
// {
// for(int j=1;j<=i;j++)
// {
//     System.out.print("#");
// }
// System.out.println();
// }

for(int i=0 ; i<n ;i++){
            for(int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = n-i ; j<= n; j++){
                System.out.print("#");
            }
            System.out.println();
        }

}
//    for(int i=0 ; i<n ;i++){
//        for(int j = 0; j <= n-i-2; j++){
//            System.out.print(" ");
//        }
//        for(int j = n-i-1 ; j< n; j++){
//            System.out.print("#");
//        }
//        System.out.println();
//    }


    
    

   
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        staircase(n);

        }
}
