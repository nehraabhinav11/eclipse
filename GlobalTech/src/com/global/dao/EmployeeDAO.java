package com.global.dao;

import java.util.List;

import com.global.bean.Employee;

public interface EmployeeDAO {

	public boolean insertEmployee(Employee ob);
	public boolean updateEmployee(Employee ob);
	public boolean deleteEmployee(Employee ob);
	
	public Employee getEmployeeById(int eid);
	public List<Employee> getAllEmployee();
	
}
