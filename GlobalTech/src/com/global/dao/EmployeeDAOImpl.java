package com.global.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import com.global.bean.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {
	private Connection con;
	@Override
	public boolean insertEmployee(Employee ob) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean inserted=false;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String username="hr";
	String password="hr";
	
	try {
	con=DriverManager.getConnection(url,username,password);
	System.out.println("connected");
	//paramaterized query
	PreparedStatement ps1=con.prepareStatement("Insert into employee values(?,?,?,?,?)");
	ps1.setInt(1, ob.getEid());
	ps1.setString(2, ob.getFname());
	ps1.setString(3,ob.getLname());
	//ZoneId defaultZoneId=ZoneId.systemDefault();
	LocalDate id=ob.getDoj();
	Date d=Date.valueOf(id);
	ps1.setDate(4, d);
	ps1.setString(5, ob.getDept());
		int i=ps1.executeUpdate();
		System.out.println("Record inserted are "+i);
	
	
	inserted=true;
	}
	catch(SQLException e) {
	System.out.println(e.getMessage());
	inserted=false;
	}
	finally {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	return inserted;
		
	}

	@Override
	public boolean updateEmployee(Employee ob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee ob) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<Employee> emplist=new ArrayList<Employee>();
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		
		try {
		con=DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		//paramaterized query
		PreparedStatement ps1=con.prepareStatement("select * from employee");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			Employee ob=new Employee();
			int id=rs.getInt("eid");
			ob.setEid(id);
			ob.setFname(rs.getString("fname"));
			ob.setLname(rs.getString("lname"));
			ob.setDoj(rs.getDate(4).toLocalDate());
			ob.setDept(rs.getString(5));
			emplist.add(ob);
		}
	
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return emplist;
	}
	}


