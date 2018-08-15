package withSpringMappings;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate.HibernateTemplate;

public class service {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate) ac.getBean("ht");
		List<phone> phones=new ArrayList<>();
		phones.add(new phone(1));
		phones.add(new phone(2));
		phones.add(new phone(3));
		ht.save(new person(1, "suhas", phones));
	}
}
