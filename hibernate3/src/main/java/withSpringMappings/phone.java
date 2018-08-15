package withSpringMappings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class phone {
	@ManyToOne
	person p;
	public phone(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "phone [number=" + number + "]";
	}

	@Id
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
