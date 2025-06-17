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

	public Employee() {
	}

	@Column(name="contactAdd")
	private String contactAdd;

	@Column(name="empEmail")
	private String empEmail;

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContactAdd(String contactAdd) {
		this.contactAdd = contactAdd;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public void setEmplPass(String emplPass) {
		this.emplPass = emplPass;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Column(name="emplPass")
	private String emplPass;

	public long getEmpId() {
		return empId;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getContactAdd() {
		return contactAdd;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public String getEmplPass() {
		return emplPass;
	}

	public String getProfile() {
		return profile;
	}

	@Column(name="profile")
	private String profile;

    public String getFilePath() {
        return profile; 
    }

    public void setFilePath(String profile) {
		this.profile = profile;
	}
}