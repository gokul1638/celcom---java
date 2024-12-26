package com.ccm.service;

import com.ccm.model.Cloud;
import com.ccm.repo.CloudRepoImpl;
import com.ccm.repo.CustomerRepoImpl;
import com.ccm.repo.CloudRepo;
import com.ccm.repo.CustomerRepo;

public class CloudServiceimpl implements CloudService {
	CustomerRepo customerRepo = new CustomerRepoImpl();
	CloudRepo  cloudRepo = new CloudRepoImpl();

	public String insertCloudValidation(Cloud cloud) {
		String result;
		if (cloud == null) {
			result = "cloud object is null";
		} else if (cloud.getCloudId() == 0 || cloud.getCloudName() == null) {
			result = "Invalid cloud Data";
		} else {
			boolean flag = cloudRepo.doInsertCloud(cloud);
			if (flag) {
				result = "Cloud object Saved";
			} else {
				result = "Cloud object not Saved";
			}
		}
		return result;
	}

	public String deleteCloudValidation(int cloudId) {
		String result = "";
		if (cloudId == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = cloudRepo.doDeleteCloud(cloudId);
			if (flag) {
				result = "Cloud object Deleted";
			} else {
				result = "Cloud object  Not Found";
			}
		}
		return result;
	}

//
////	
	public String updateCloudValidation(Cloud cloud) {
		String result;
		if (cloud == null) {
			result = "Cloud Object is Null";
		} else if (cloud.getCloudId() == 0 || cloud.getCloudName() == null) {
			result = "Invalid cloud Data";
		} else {
			boolean flag = cloudRepo.doUpdateCloud(cloud);
			if (flag) {
				result = "Cloud Object Updated ";
			} else {
				result = "Cloud Object Not Found ";
			}
		}
		return result;
	}

	
	public String findCloudValidation(int cloudId) {
		String result = "";
		if (cloudId == 0) {
			result = "Invalid cloud Number";
		} else {
			Cloud cloud = cloudRepo.doFindCloud(cloudId);
			if (cloud != null) {
				result = cloud.toString();
			} else {
				result = "Department object  Not Found";
			}
		}
		return result;
	}

	public String findAllCloudValidation() {
		return cloudRepo.doFindAllCloud().toString();
	}

}
