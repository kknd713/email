package com.jb.cdjj.email.kknd713.entity;

public class Department {
	private int id;
	private String name;
	private Branch branch;
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
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Department(int id, String name, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public Department() {
		super();
	}
	
	
}
