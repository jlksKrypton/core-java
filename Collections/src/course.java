
public class course {

	String name;
	int id;
	
	
	public course( int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}
	
	


	public int hashCode2() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	public boolean equals2(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		course other = (course) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return new Integer(this.getId()).hashCode()+this.getName().hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		return (this.hashCode()==obj.hashCode());
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
