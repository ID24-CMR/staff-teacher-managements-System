package org.idrice24.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payroll")
public class Payroll{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long payId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empId", referencedColumnName = "empId")
	private Employee employee;

	public long getPayId() {
		return payId;
	}

	public void setPayId(long payId) {
		this.payId = payId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Leave getLeave() {
		return leave;
	}

	public void setLeave(Leave leave) {
		this.leave = leave;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Double getTtamount() {
		return ttamount;
	}

	public void setTtamount(Double ttamount) {
		this.ttamount = ttamount;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dep_id", referencedColumnName = "dep_id")
	private Department department;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="salaryId", referencedColumnName = "salaryId")
	private Salary salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="leaveId", referencedColumnName = "leaveId")
	private Leave leave;

	@Column(name="date")
	private Date date;

	@Column(name="report")
	private String report;

	@Column(name="ttamount")
	private Double ttamount;

	

}