package Day19;

import java.util.*;

class Student {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);

	}
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(102, "Ajay", 30));
		al.add(new Student(103, "Eric", 27));

		System.out.println("Sorting by age:");
		System.out.println("hdghjwfe,jfh");

		Collections.sort(al, new AgeComparator());

		for (Student st : al) {
			System.out.println(st.rollno + "  " + st.name + "  " + st.age);
		}
		
		System.out.println("Vikas Pawar");

		System.out.println("jhdgkhjf");

		System.out.println();
		System.out.println("Sorting by Name:");

		Collections.sort(al, new NameComparator());

		for (Student st : al) {
			System.out.println(st.rollno + "  " + st.name + "  " + st.age);

		}
	}

}
