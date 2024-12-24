package com.EMS2.model;

public class Employee {
	private int eId;
	private String EName;
	private int salary;
	private Department department;
	
	public Employee(){
		
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", EName=" + EName + ", salary=" + salary + ", department=" + department + "]";
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(int eId, String eName, int salary, Department department) {
		super();
		this.eId = eId;
		EName = eName;
		this.salary = salary;
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
