package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BusinessGoalsId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int goalId;
    private String employeAppraisals;

    public BusinessGoalsId() {
    }

    public BusinessGoalsId(int goalId, String employeAppraisals) {
	this.goalId = goalId;
	this.employeAppraisals = employeAppraisals;
    }

    @Column(name = "Goal_Id", nullable = false)
    public int getGoalId() {
	return this.goalId;
    }

    public void setGoalId(int goalId) {
	this.goalId = goalId;
    }

    @Column(name = "Employe_Appraisals", nullable = false, length = 200)
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
	if (!(other instanceof BusinessGoalsId))
	    return false;
	BusinessGoalsId castOther = (BusinessGoalsId) other;

	return (this.getGoalId() == castOther.getGoalId())
		&& ((this.getEmployeAppraisals() == castOther.getEmployeAppraisals()) || (this.getEmployeAppraisals() != null
			&& castOther.getEmployeAppraisals() != null && this.getEmployeAppraisals().equals(
			castOther.getEmployeAppraisals())));
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + this.getGoalId();
	result = 37 * result + (getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode());
	return result;
    }

}
