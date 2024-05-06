package springs_xml;  //springs always create each class as singleton class

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerDriver {

	public static void main(String[] args) {
		//using java
		
//		Computer c = new Computer();
//		c.used();
		
		//using springs
		BeanFactory factory = new ClassPathXmlApplicationContext("mycomputer.xml");
		Computer computer = (Computer) factory.getBean("comp");
//		computer.used();
				
		System.out.println(computer);
		
		Computer computer2 = (Computer) factory.getBean("comp");
		System.out.println(computer2);   //singleton class - static var, static method, make constructor private
	}
}
