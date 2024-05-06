package springs_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myemployee.xml");
		Employee employee = context.getBean("emp",Employee.class);
		employee.info();
	}
}
