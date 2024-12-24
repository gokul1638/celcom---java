package com.EMS2.model;

public class Department {
	private int dept_no;
	private String dept_name;
	private String location;
	public Department(){
		
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [dept_no=" + dept_no + ", dept_name=" + dept_name + ", location=" + location + "]";
	}

	public Department(int dept_no, String dept_name, String location) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.location = location;
	}

}
