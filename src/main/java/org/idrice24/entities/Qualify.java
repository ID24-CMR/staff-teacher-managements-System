package org.idrice24.entities;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qualify")
public class Qualify{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="name")
	private String name;

	@Column(name="cdate")
	private Date cdate;

	@Column(name="update")
	private Date update;

	@Column(name="description")
	private String description;

	public void Qualify(){}

	public void Qualify(String name, Date cdate, Date update){
		this.cdate = cdate;
		this.name = name;
		this.update = update;
	}

	public void setId(long id){
		this.id = id;
	}

	public long ggetId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdate(Date update){
		this.update = update;
	}

	public Date getUpdate(){
		return update;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

}