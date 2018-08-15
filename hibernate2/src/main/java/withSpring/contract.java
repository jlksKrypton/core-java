package withSpring;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.stereotype.Component;


@Component
@Entity
//@DiscriminatorValue("contract")
@PrimaryKeyJoinColumn(name="fkey")
public class contract extends employee{

	public contract(int id, String name) {
		super(id, name);
	}

	int noOfDays;
	int payPerHour;
	public int getNoOfDays() {
		return noOfDays;
	}
	public contract(int id, String name, int noOfDays, int payPerHour) {
		super(id, name);
		this.noOfDays = noOfDays;
		this.payPerHour = payPerHour;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	@Override
	public String toString() {
		return "contract [noOfDays=" + noOfDays + ", payPerHour=" + payPerHour + ", id=" + id + ", name=" + name + "]";
	}
	
}
