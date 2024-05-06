package springs_xml;

public class Employee {

	String name;
	String designation;
	double salary;
	
    Employee(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void info() {
		System.out.println("Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]");
	}
	
	
	
	
}
