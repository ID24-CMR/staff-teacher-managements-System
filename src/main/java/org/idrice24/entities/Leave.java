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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaId;

    @Column(name="startDate")
    private Date startDate;

    @Column(name="endDate")
    private Date endDate;

    @Column(name ="reason")
    private String reason;

    @Column(name="empId", insertable = false, updatable = false)
    private String empId;

    public Leave() {
    }

    public long getLeaveId() {
        return leaId;
    }

    public void setLeaveId(long leaId) {
        this.leaId = leaId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getReason() {
        return reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEmpId(String empId){
        this.empId = empId;
    }

    public String getEmpId(){
        return empId;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="empId", referencedColumnName="empId")
    private Employee employee;

}
