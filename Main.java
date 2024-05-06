package xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

   Resource resource = new ClassPathResource("customer.xml");
   BeanFactory factory = new XmlBeanFactory(resource);
//   Customer customer = (Customer) factory.getBean("c");
   Customer customer = factory.getBean(Customer.class);
   customer.shop();
   
}
