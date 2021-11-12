package com.hcl.projects.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employ {

	@Value("1001")
	private int id;

	@Value("Arun")
	private String name;

	public Employ() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + "]";
	}

	
}
