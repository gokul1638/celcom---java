package com.ccm.view;

import java.util.Scanner;

import com.ccm.model.Cloud;


public class CloudView {
	static Scanner sc = new Scanner(System.in);

	static int cloudId;
	static String cloudName;

	public static Cloud insertCloudView() {
		System.out.println("Enter cloud id , Cloud Name ");
		cloudId = sc.nextInt();
		cloudName = sc.next();

		return new Cloud(cloudId, cloudName);

	}

	public static int deleteCloudView() {
		System.out.println("Enter Cloud Id:");
		return sc.nextInt();
	}

	public static Cloud updateCloudView() {
		System.out.println("Enter cloud  id,cloud Name to update");
		cloudId = sc.nextInt();
		cloudName = sc.next();

		return new Cloud(cloudId, cloudName);
	}

	public static int findCloudView() {
		System.out.println("Enter cloud number :");
		return sc.nextInt();
	}

}
