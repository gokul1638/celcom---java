package com.ccm.repo;

import java.util.List;

import com.ccm.model.Cloud;

public interface CloudRepo {
	public boolean doInsertCloud(Cloud cloud);

	public boolean doDeleteCloud(int cloudId);

	public boolean doUpdateCloud(Cloud cloud);

	public Cloud doFindCloud(int cloudId);

	public List<Cloud> doFindAllCloud();
}
