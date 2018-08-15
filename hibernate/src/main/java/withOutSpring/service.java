package withOutSpring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class service {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate-cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		employee e=new employee(1, "a");
		fulltime fe=new fulltime(2, "b", 100, 10);
		contract ce=new contract(3, "c", 365, 65);
		s.persist(e);
		s.persist(fe);
		s.persist(ce);
		System.out.println(s.createQuery("from employee").list());
		t.commit();
		s.close();
		sf.close();
	}
}
