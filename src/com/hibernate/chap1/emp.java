package com.hibernate.chap1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {
	int empId;
	String empName;
	
	@Id
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
