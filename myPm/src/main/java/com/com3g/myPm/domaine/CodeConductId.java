package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CodeConductId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int coCId;
    private String employeAppraisals;

    public CodeConductId() {
    }

    public CodeConductId(int coCId, String employeAppraisals) {
	this.coCId = coCId;
	this.employeAppraisals = employeAppraisals;
    }

    @Column(name = "CoC Id", nullable = false)
    public int getCoCId() {
	return this.coCId;
    }

    public void setCoCId(int coCId) {
	this.coCId = coCId;
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
	if (!(other instanceof CodeConductId))
	    return false;
	CodeConductId castOther = (CodeConductId) other;

	return (this.getCoCId() == castOther.getCoCId())
		&& ((this.getEmployeAppraisals() == castOther.getEmployeAppraisals()) || (this.getEmployeAppraisals() != null
			&& castOther.getEmployeAppraisals() != null && this.getEmployeAppraisals().equals(
			castOther.getEmployeAppraisals())));
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + this.getCoCId();
	result = 37 * result + (getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode());
	return result;
    }

}
