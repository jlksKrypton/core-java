package withSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
public class main {
	
	public static void main(String[] args) {
		crud c= new crud();
		ApplicationContext ac=new ClassPathXmlApplicationContext("application_context.xml");
		c.setJt((JdbcTemplate) ac.getBean("javaT"));
		c.insert(new employee(1, "a"));
		c.preparedInsert(new employee(2, "b"));
		c.preparedInsert(new employee(3, "c"));
		List<employee> l = c.extractAllResultSetExtractor();
		l.forEach(System.out::println);
		c.delete(new employee(2, "b"));
		c.update(new employee(3, "b"));
		l = c.extractAllRowMapper();
		l.forEach(System.out::println);
	}
}
