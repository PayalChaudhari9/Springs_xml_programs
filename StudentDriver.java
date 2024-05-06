package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("study.xml");
		Student student = (Student) factory.getBean("stud");
		student.study();
		System.out.println(student.name);
		System.out.println(student.age);
	}
}
