package org.idrice24.entities;

import java.util.Date;

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
@Table(name="qualification")
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long qualId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="empId", referencedColumnName = "empId")
    private Employee employee;

    @Column(name="position")
    private String position;

    @Column(name="requirement")
    private String requirement;

    @Column(name="datein")
    private Date datein;

}
