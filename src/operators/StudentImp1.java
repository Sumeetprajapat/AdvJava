package operators;

public class StudentImp1 {
	public static void main (String[] args) {
//		Student s1 = new Student();
//		s1.setRollNo(1);
//		s1.setName("Raj");
//		s1.setMarks(500);
//		s1.setCourse("Java");
//		System.out.println("Rollno:"+s1.getRollNo());
//		System.out.println("Name"+s1.getame());
//		System.out.println("Total Marks"+s1.getMarks());
//		System.out.println("Course"+s1.getCourse());
		Student ss= new Student(1,"Raj",500,"Java");
		System.out.println("Students details\n"+ss);
	}
}
