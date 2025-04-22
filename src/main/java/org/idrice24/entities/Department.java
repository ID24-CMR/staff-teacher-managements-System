package org.idrice24.entities;


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