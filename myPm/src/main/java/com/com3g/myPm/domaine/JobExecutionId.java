package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobExecutionId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int jeId;
    private String employeAppraisals;

    public JobExecutionId() {
    }

    public JobExecutionId(int jeId, String employeAppraisals) {
	this.jeId = jeId;
	this.employeAppraisals = employeAppraisals;
    }

    @Column(name = "Je_Id", nullable = false)
    public int getJeId() {
	return this.jeId;
    }

    public void setJeId(int jeId) {
	this.jeId = jeId;
    }

    @Column(name = "Employe_Appraisals", nullable = false, length = 100)
    public String getEmployeAppraisals() {
	return this.employeAppraisals;
    }

    public void setEmployeAppraisals(String employeAppraisals) {
	this.employeAppraisals = employeAppraisals;
    }

    public boolean equals(Object other) {
	if ((this == other))
	    return true;
	if ((other == null))
	    return false;
	if (!(other instanceof JobExecutionId))
	    return false;
	JobExecutionId castOther = (JobExecutionId) other;

	return (this.getJeId() == castOther.getJeId())
		&& ((this.getEmployeAppraisals() == castOther.getEmployeAppraisals()) || (this.getEmployeAppraisals() != null
			&& castOther.getEmployeAppraisals() != null && this.getEmployeAppraisals().equals(
			castOther.getEmployeAppraisals())));
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + this.getJeId();
	result = 37 * result + (getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode());
	return result;
    }

}
