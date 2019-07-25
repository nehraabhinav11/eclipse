package com.global.service;
import com.global.dao.*;


import java.util.List;

import com.global.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao= new EmployeeDAOImpl();
	@Override
	public boolean createNewEmployee(Employee ob) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(ob);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public List<Employee> groupByEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Department(Employee ob, String dep) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee ob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getMyAcount(int accno) {
		// TODO Auto-generated method stub
		return null;
	}

}
