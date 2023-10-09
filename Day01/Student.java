//Java Program to illustrate how to define class and fields
package Day01;
public class Student {
	//defining fields
	int id=123;
	String name="Vikas";
	
	//Main method
	public static void main(String args[]) {
		Student s1=new Student();
		
		System.out.println("ID: "+s1.id);
		System.out.println("Name: "+s1.name);
		
	}

}
