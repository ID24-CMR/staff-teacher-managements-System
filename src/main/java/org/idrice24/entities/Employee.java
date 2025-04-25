package org.idrice24.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;

	@Column(name="fname")
	private String fname;

	@Column(name="lname")
	private String lname;

	@Column(name="gender")
	private String gender;

	@Column(name="age")
	private int age;

	@Column(name="contactAdd")
	private String contactAdd;

	@Column(name="empEmail")
	private String empEmail;

	@Column(name="emplPass")
	private String emplPass;
}