package com.global.bean;
import java.time.LocalDate;
public class Employee {

	private int eid;
	private String fname;
	private String lname;
	private LocalDate doj;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String fname, String lname, LocalDate doj, String dept) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.doj = doj;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", doj=" + doj + ", dept=" + dept
				+ "]";
	}
	
	
}
