package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mymobile.xml");
		Mobile mobile = (Mobile) context.getBean("m");
		mobile.info();
		mobile.used();
	}
}
