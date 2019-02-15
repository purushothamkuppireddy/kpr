package Demo;


		class Objects
		{
			int accNo;
			int balance;
			Objects(){
				System.out.println("Constructor called");
				
			      }
			public Objects(int accNo,int balance) {
				this();
				this.accNo=accNo;
				this.balance=balance;
				System.out.println(accNo+" "+balance);
				new Objects();
			   }
			public static void main(String[] args) {
				Objects b1= new Objects(50,20);
			}
			
		

	}

