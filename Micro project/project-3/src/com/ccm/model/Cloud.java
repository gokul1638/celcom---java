package com.ccm.model;

public class Cloud {
	private int cloudId;
	private String cloudName;
	
	public Cloud() {
		
	}

	public Cloud(int cloudId, String cloudName) {
		super();
		this.cloudId = cloudId;
		this.cloudName = cloudName;
	}

	public int getCloudId() {
		return cloudId;
	}

	public void setCloudId(int cloudId) {
		this.cloudId = cloudId;
	}

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	@Override
	public String toString() {
		return "Cloud [cloudId=" + cloudId + ", cloudName=" + cloudName + "]";
	}
	
	

}
