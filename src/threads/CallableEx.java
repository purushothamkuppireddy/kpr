package threads;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx implements Callable {

	
		@Override
		public Integer call() throws Exception {
			Thread.sleep(1000);
			int a=10;
			int b=8;
			int c=a+b;
			return ++c; 
		}
		
		public static void main(String[] args)  {
			

			ExecutorService service=Executors.newFixedThreadPool(10);
			for(int i=0;i<5;i++) {
			Future<Integer> future=service.submit(new CallableEx());
			
//			int p=15;
//			int q=589;
//			int r=p+q;
//			System.out.println("value: "+r);
			try {
				int result=future.get();
				System.out.println("future value: "+result);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			
		
		}
		}
		
		
		
		}

	

