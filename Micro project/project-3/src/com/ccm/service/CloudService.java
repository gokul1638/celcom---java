package com.ccm.service;

import com.ccm.model.Cloud;

public interface CloudService {
	public String insertCloudValidation(Cloud cloud);

	public String deleteCloudValidation(int cloudId);

	public String updateCloudValidation(Cloud cloud);

	public String findCloudValidation(int cloudId);

	public String findAllCloudValidation();

}
