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
@Table(name="leave")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long leaveId;

    @Column(name="date")
    private Date date;

    @Column(name ="reason")
    private String reason;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="empId", referencedColumnName="empId")
    private Employee employee;

}
