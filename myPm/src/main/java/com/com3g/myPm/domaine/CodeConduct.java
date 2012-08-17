package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "code_conduct", catalog = "mypm")
public class CodeConduct implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private CodeConductId id;
    private String coCTitle;
    private String coCDetails;
    private double coCWeight;
    private int summaryRating;

    public CodeConduct() {
    }

    public CodeConduct(CodeConductId id, String coCTitle, String coCDetails, double coCWeight, int summaryRating) {
	this.id = id;
	this.coCTitle = coCTitle;
	this.coCDetails = coCDetails;
	this.coCWeight = coCWeight;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "coCId", column = @Column(name = "CoC_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 100)) })
    public CodeConductId getId() {
	return this.id;
    }

    public void setId(CodeConductId id) {
	this.id = id;
    }

    @Column(name = "CoC_Title", nullable = false, length = 100)
    public String getCoCTitle() {
	return this.coCTitle;
    }

    public void setCoCTitle(String coCTitle) {
	this.coCTitle = coCTitle;
    }

    @Column(name = "CoC_details", nullable = false, length = 450)
    public String getCoCDetails() {
	return this.coCDetails;
    }

    public void setCoCDetails(String coCDetails) {
	this.coCDetails = coCDetails;
    }

    @Column(name = "CoC_Weight", nullable = false, precision = 22, scale = 0)
    public double getCoCWeight() {
	return this.coCWeight;
    }

    public void setCoCWeight(double coCWeight) {
	this.coCWeight = coCWeight;
    }

    @Column(name = "Summary_rating", nullable = false)
    public int getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(int summaryRating) {
	this.summaryRating = summaryRating;
    }

}
