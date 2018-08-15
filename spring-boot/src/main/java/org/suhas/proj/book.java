package org.suhas.proj;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class book  implements Serializable{
	int id;
	String name;
	
	public book() {
		super();
	}
	
	public book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
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

}
