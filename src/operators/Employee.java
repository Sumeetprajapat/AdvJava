package operators;

public class Employee {
	private int empNo;
	private String name;
	private int salary;
	private String department;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	public Employee(int empNo, String name, int salary, String department) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
		
}
