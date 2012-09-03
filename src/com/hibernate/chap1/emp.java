package com.hibernate.chap1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
public class emp {
	int empId;
	String empName;
	
	/*
	 * 
	 * 
	 * @TableGenerator(name="empid", table="empPKey", pkColumnName="empkey", pkColumnValue="empvalue",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empid")
	 */
	
	@Id
	@GeneratedValue
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
