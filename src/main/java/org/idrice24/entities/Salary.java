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
    @JoinColumn(name ="dep_id", referencedColumnName ="dep_id")
    private Department department;

    @Column(name="amount")
    private double amount;

    @Column(name="anual")
    private int anual; 

    @Column(name="bonus")
    private double bonus;

    public long getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(long salaryId) {
        this.salaryId = salaryId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAnual() {
        return anual;
    }

    public void setAnual(int anual) {
        this.anual = anual;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
