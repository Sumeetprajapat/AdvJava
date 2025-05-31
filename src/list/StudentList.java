package list;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		Student student1 = new Student(1, "jack", 77777777, "bsc cs", "jack123@gmail.com");
		Student student2 = new Student(2, "rose", 77777777, "bsc cs", "jack123@gmail.com");
		Student student3 = new Student(3, "joe", 77777777, "bsc cs", "jack123@gmail.com");
		Student student4 = new Student(4, "stella", 77777777, "bsc cs", "jack123@gmail.com");
		Student student5 = new Student(5, "nova", 77777777, "bsc cs", "jack123@gmail.com");

		std.add(student1);
		std.add(student2);
		std.add(student3);
		std.add(student4);
		std.add(student5);

		for (Student s : std) {
			System.out.println(s);
		}
	}
}
