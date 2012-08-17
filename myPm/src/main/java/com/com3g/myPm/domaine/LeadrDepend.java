package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "leadr_depend", catalog = "mypm")
public class LeadrDepend implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private LeadrDependId id;
    private String ldTitle;
    private String ldDetails;
    private double ldWeight;
    private int summaryRating;

    public LeadrDepend() {
    }

    public LeadrDepend(LeadrDependId id, String ldTitle, String ldDetails, double ldWeight, int summaryRating) {
	this.id = id;
	this.ldTitle = ldTitle;
	this.ldDetails = ldDetails;
	this.ldWeight = ldWeight;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "ldId", column = @Column(name = "Ld_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 100)) })
    public LeadrDependId getId() {
	return this.id;
    }

    public void setId(LeadrDependId id) {
	this.id = id;
    }

    @Column(name = "Ld_Title", nullable = false, length = 100)
    public String getLdTitle() {
	return this.ldTitle;
    }

    public void setLdTitle(String ldTitle) {
	this.ldTitle = ldTitle;
    }

    @Column(name = "Ld_details", nullable = false, length = 450)
    public String getLdDetails() {
	return this.ldDetails;
    }

    public void setLdDetails(String ldDetails) {
	this.ldDetails = ldDetails;
    }

    @Column(name = "Ld_Weight", nullable = false, precision = 22, scale = 0)
    public double getLdWeight() {
	return this.ldWeight;
    }

    public void setLdWeight(double ldWeight) {
	this.ldWeight = ldWeight;
    }

    @Column(name = "Summary_rating", nullable = false)
    public int getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(int summaryRating) {
	this.summaryRating = summaryRating;
    }

}
