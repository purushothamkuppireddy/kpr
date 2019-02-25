package wrapperEx;

public class Student1 implements Comparable<Student1> {

int roll;
String name;	
int age;
Student1(int roll,String name,int age){
	
	this.roll=roll;
	this.name=name;
	this.age=age;
	
	
}

public int compareTo(Student1 st)
{
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else
		return -1;
	
}
	
	
	
	
}
