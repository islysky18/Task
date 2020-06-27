package com.tobias.HibernateDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Emp {

	private String id;
	private String name;
	private Map<String, PhoneNumber> phoneno;
//	private Map<String, >
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, PhoneNumber> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Map<String, PhoneNumber> phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
	
}