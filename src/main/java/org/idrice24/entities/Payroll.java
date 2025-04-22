package org.idrice24.entities;

@Entity
@Table(name="payroll")
public class Payroll{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long payId;
	

}