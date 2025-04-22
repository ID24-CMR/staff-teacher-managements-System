package org.idrice24.entities;

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
@Table(name ="salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long salaryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="depId", referencedColumnName ="depId")
    private Department department;

    @Column(name="amount")
    private double amount;

    @Column(name="anual")
    private int anual; 

    @Column(name="bonus")
    private double bonus;
}
