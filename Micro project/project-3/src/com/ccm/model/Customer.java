package com.ccm.model;

public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private Cloud cloud;

	public Customer() {
	}

	public Customer(int customerId, String customerName, long phoneNumber, Cloud cloud) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.cloud = cloud;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", cloud=" + cloud + "]";
	}

}
