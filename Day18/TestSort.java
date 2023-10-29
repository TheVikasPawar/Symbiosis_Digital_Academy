package Day18;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class TestSort {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		//Passed User Defined Class.
		al.add(new Student(101, "Vijay", 21));
		al.add(new Student(102, "Ajay", 23));
		al.add(new Student(103, "Jai", 22));
		al.add(new Student(104, "Om", 25));

		Collections.sort(al);

		for (Student student : al) {
			System.out.println(student.rollno + "  " + student.name + "  " + student.age);
		}

	}

}
