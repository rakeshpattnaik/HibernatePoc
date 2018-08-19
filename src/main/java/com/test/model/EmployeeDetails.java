package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_details",schema="hibernate_examples")
public class EmployeeDetails {

	@Id
	@SequenceGenerator(name="id_pk",sequenceName="emp_seq_test",schema="hibernate_examples",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_pk")
	private long id;
	
	@Column(name = "emp_name", nullable=true)
	private String empName;

	@Column(name = "emp_id", nullable=false, unique=true)
	private String empId;

	@Column(name = "emp_age", nullable=true)
	private int empAge;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
