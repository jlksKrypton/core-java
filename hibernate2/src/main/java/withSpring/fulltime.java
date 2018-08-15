package withSpring;
import javax.persistence.AttributeOverrides;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.stereotype.Component;


@Component
@Entity
//@DiscriminatorValue("fulltime")
@PrimaryKeyJoinColumn(name="fkey")
public class fulltime extends employee{

	public fulltime(int id, String name) {
		super(id, name);
	}
	
	public fulltime(int id, String name, int salary, int increment) {
		super(id, name);
		this.salary = salary;
		this.increment = increment;
	}

	int salary;
	int increment;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	@Override
	public String toString() {
		return "fulltime [salary=" + salary + ", increment=" + increment + ", id=" + id + ", name=" + name + "]";
	}
	
}
