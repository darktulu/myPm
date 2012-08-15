package com.com3g.myPm.domaine;

// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonAttributId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int paId;
    private String employeAppraisals;

    public PersonAttributId() {
    }

    public PersonAttributId(int paId, String employeAppraisals) {
	this.paId = paId;
	this.employeAppraisals = employeAppraisals;
    }

    @Column(name = "Pa_Id", nullable = false)
    public int getPaId() {
	return this.paId;
    }

    public void setPaId(int paId) {
	this.paId = paId;
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
	if (!(other instanceof PersonAttributId))
	    return false;
	PersonAttributId castOther = (PersonAttributId) other;

	return (this.getPaId() == castOther.getPaId())
		&& ((this.getEmployeAppraisals() == castOther.getEmployeAppraisals()) || (this.getEmployeAppraisals() != null
			&& castOther.getEmployeAppraisals() != null && this.getEmployeAppraisals().equals(
			castOther.getEmployeAppraisals())));
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + this.getPaId();
	result = 37 * result + (getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode());
	return result;
    }

}
