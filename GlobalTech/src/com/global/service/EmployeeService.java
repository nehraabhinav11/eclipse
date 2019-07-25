package com.global.service;

import java.util.List;

import com.global.bean.Employee;

public interface EmployeeService {

	public boolean createNewEmployee(Employee ob);
	public List<Employee>getAllEmployee();
	public List<Employee>groupByEmployee();
	public boolean Department(Employee ob,String dep);
	public boolean deleteEmployee(Employee ob);
	public Employee getMyAcount(int accno);
	
}
