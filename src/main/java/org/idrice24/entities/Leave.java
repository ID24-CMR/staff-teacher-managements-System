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

    public Leave() {
    }

    public long getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(long leaveId) {
        this.leaveId = leaveId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Column(name ="reason")
    private String reason;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="empId", referencedColumnName="empId")
    private Employee employee;

}
