package operators;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	private String course;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Student(int rollNo, String name, int marks, String course) {
//		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}

