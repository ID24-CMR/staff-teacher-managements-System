package org.idrice24.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dep_id;

	@Column(name="dep_name")
	private String dep_name;

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}

	public Department(long dep_id, String dep_name) {
		this.dep_id = dep_id;
		this.dep_name = dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setYexperience(int yexperience) {
		this.yexperience = yexperience;
	}

	public long getDep_id() {
		return dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public String getDescription() {
		return description;
	}

	public double getSalary() {
		return salary;
	}

	public int getYexperience() {
		return yexperience;
	}

	@Column(name="description")
	private String description;

	@Column(name="salary")
	private double salary;

	@Column(name="yexperience")
	private int yexperience;

	public Department() {
	}
}