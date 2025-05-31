package list;

import java.util.ArrayList;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		Employee emp1 = new Employee(1, "Roshan", 35000, "HR");
		Employee emp2 = new Employee(2, "Ajay", 14000, "Sales");
		Employee emp3 = new Employee(3, "Pratik", 25000, "Java Dev");
		Employee emp4 = new Employee(4, "Omkar", 20000, "DevOps");
		em.add(emp1);
		em.add(emp2);
		em.add(emp3);
		em.add(emp4);

		for (Employee e : em) {
			System.out.println(e);
		}

	}

}
