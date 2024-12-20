package com.ems.repo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

public class EmployeeRepo1 {
	public boolean doInsert(Employee employee) {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.geteId(), employee);
		return true;
	}

	public boolean doDelete(int id) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			map.remove(id);
			flag = true;
		}
		return flag;
	}

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.geteId())) {
			map.put(employee.geteId(), employee);
			flag = true;
		}
		return flag;
	}

	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}

	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;
	}
//	public boolean isEmpty()
//	{
//		return DBUtil.getListIsEmpty();
//	}

}
