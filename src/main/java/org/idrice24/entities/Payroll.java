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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="depId", referencedColumnName = "depId")
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