package org.idrice24.entities;

@Entity
@Table(name="employee")
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;

	@Column(name="fname")
	private String fname;

	@Column(name="lname")
	private String fname;

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