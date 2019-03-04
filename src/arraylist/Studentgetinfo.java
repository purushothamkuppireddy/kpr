		
		package arraylist;
		import java.util.*;

		import wrapperEx.Student;

		import java.io.*;
		public class Studentgetinfo {
		static int count=1;
			public static Student setInfo(){
				Scanner sc=new Scanner(System.in);
				Student s =new Student();
				System.out.println("enter student details"+count);
				s.setName(sc.nextLine());
				s.setFees(sc.nextInt());
				s.setRoll(sc.nextInt());
				count++;
				return s;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Student> sa=new ArrayList<>();
				sa.add(setInfo());
				sa.add(setInfo());
				
				System.out.println(sa);
				try {
					FileOutputStream f=new FileOutputStream("E:\\Programjava\\StuFile.txt");
				ObjectOutputStream obj=new ObjectOutputStream(f);
					obj.writeObject(sa);
					
					FileInputStream f2=new FileInputStream("E:\\Programjava\\StuFile.txt");
					ObjectInputStream out=new ObjectInputStream(f2);
					ArrayList<Student> ua=(ArrayList<Student>)out.readObject();
					System.out.println(ua.get(1).getName());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		


		
		
		
		

		}


		
