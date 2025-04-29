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

	@Column(name="description")
	private String description;

	@Column(name="salary")
	private double salary;

	@Column(name="yexperience")
	private int yexperience;
}