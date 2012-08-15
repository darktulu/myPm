package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LeadrDependId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int ldId;
    private String employeAppraisals;

    public LeadrDependId() {
    }

    public LeadrDependId(int ldId, String employeAppraisals) {
	this.ldId = ldId;
	this.employeAppraisals = employeAppraisals;
    }

    @Column(name = "Ld_Id", nullable = false)
    public int getLdId() {
	return this.ldId;
    }

    public void setLdId(int ldId) {
	this.ldId = ldId;
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
	if (!(other instanceof LeadrDependId))
	    return false;
	LeadrDependId castOther = (LeadrDependId) other;

	return (this.getLdId() == castOther.getLdId())
		&& ((this.getEmployeAppraisals() == castOther.getEmployeAppraisals()) || (this.getEmployeAppraisals() != null
			&& castOther.getEmployeAppraisals() != null && this.getEmployeAppraisals().equals(
			castOther.getEmployeAppraisals())));
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + this.getLdId();
	result = 37 * result + (getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode());
	return result;
    }

}
