package org.idrice24.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long depId;

	@Column(name="depName")
	private String depName;

	@Column(name="description")
	private String description;

	@Column(name="salary")
	private double salary;

	@Column(name="yexperience")
	private int yexperience;
}