package withSpringMappings;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class person {
	@Id
	int id;
	String name;
	@OneToMany
	List<phone> l=new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<phone> getL() {
		return l;
	}
	public void setL(List<phone> l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	public person(int id, String name, List<phone> l) {
		super();
		this.id = id;
		this.name = name;
		this.l = l;
	}
}
