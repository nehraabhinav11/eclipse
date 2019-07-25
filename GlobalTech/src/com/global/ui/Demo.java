package com.global.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.global.bean.Employee;
import com.global.service.EmployeeService;
import com.global.service.EmployeeServiceImpl;

public class Demo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		EmployeeService service =new EmployeeServiceImpl();
		Employee ob=new Employee(102,"inav","Nehra",LocalDate.of(1997, 05, 21),"Research");
		

		service.createNewEmployee(ob);
		//service.withdraw(ob, 10000.00);
		
		List<Employee>alist=service.getAllEmployee();
		for(Employee o:alist)
		{
			System.out.println(o);
		
		}
	
	}
	

}
