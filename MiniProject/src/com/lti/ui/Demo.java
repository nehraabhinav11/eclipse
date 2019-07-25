package com.lti.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.*;
import com.lti.bean.Employee;
import com.lti.dao.EmployeeDAO;
import com.lti.dao.EmployeeDAOImpl;
import com.lti.service.EmployeeService;
import com.lti.service.EmployeeServiceImpl;

public class Demo {
	
	public static void main(String[] args)  throws ClassNotFoundException,SQLException {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		//case1:Accept Data
		Employee emp=new Employee(101, "Amir", "Khan", LocalDate.of(1997, 7, 07), 20);
		
		//service.createNewEmployee(emp);
		
		//service.deleteEmployee(emp);
		
		/*System.out.println("Enter Deptno :");
		int deptno=sc.nextInt();
		List<Employee> alist=service.getEmployeeByDept(deptno);
		for(Employee e:alist)
			System.out.println(e);
		*/
		service.updateEmployeeDept(emp);
		
		/*List<Employee> alist=service.getAllEmployees();
		for(Employee e:alist)
			System.out.println(e);
		*/
	}
	
}
