package withSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


public class service {

	public static void main(String[] args) {
	
		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht= (HibernateTemplate) ac.getBean("template");
		ht.saveOrUpdate(new employee(1, "a"));
		ht.saveOrUpdate(new fulltime(2, "b", 100, 10));
		ht.saveOrUpdate(new contract(3, "c", 365, 65));
		System.out.println(ht.loadAll(employee.class));
		System.out.println(ht.loadAll(fulltime.class));
		System.out.println(ht.loadAll(contract.class));
	}
}
