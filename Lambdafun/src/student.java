
public class student implements Comparable<student>{

	String firstName,lastName,id;
	department dept;
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public department getDept() {
		return dept;
	}


	public void setDept(department dept) {
		this.dept = dept;
	}


	public student(String firstName, String lastName, String id, department dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dept = dept;
	}


	public String toString() {
		return new String(" firstName = "+ firstName + " lastName = "+ lastName + " id = " + id + " Department = "+ dept.getName());
	}


	@Override
	public int compareTo(student o) {
		if(this.dept.name.compareTo(o.dept.name)==0)
		{
			return this.lastName.compareTo(o.lastName);
		}
		else return this.dept.name.compareTo(o.dept.name);
	}
}