class Employee
{
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int empNum, String empName, double empSalary)
	{
		this.empNum = empNum;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}
	void displayEmpDetails()
	{
		System.out.println("Employee Number = " + empNum);
		System.out.println("Employee Name = " + empName);
		System.out.println("Employee Salary = " + empSalary+ "$");

	}
	}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpDetails(1, "Tej", 150000);
		e1.displayEmpDetails();
		Employee e2 = new Employee();
		e2.setEmpDetails(2, "Ram", 160000);
		e2.displayEmpDetails();

	}

}
