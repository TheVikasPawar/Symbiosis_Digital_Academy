package Day1;

class Student3{
	int id;
	String name;
}
//Multiple Objects and Store information in it through reference variable
public class TestStudent3 {
	public static void main(String[] args) {
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		
		s1.id=100;
		s1.name="Name1";
		
		s2.id=101;
		s2.name="Name2";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}
