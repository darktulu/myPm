package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "management_responsab", catalog = "mypm")
public class ManagementResponsab implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private ManagementResponsabId id;
    private String mrTitle;
    private String mrDetails;
    private double mrWeight;
    private int summaryRating;

    public ManagementResponsab() {
    }

    public ManagementResponsab(ManagementResponsabId id, String mrTitle, String mrDetails, double mrWeight,
	    int summaryRating) {
	this.id = id;
	this.mrTitle = mrTitle;
	this.mrDetails = mrDetails;
	this.mrWeight = mrWeight;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "mrId", column = @Column(name = "Mr_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 100)) })
    public ManagementResponsabId getId() {
	return this.id;
    }

    public void setId(ManagementResponsabId id) {
	this.id = id;
    }

    @Column(name = "Mr_Title", nullable = false, length = 100)
    public String getMrTitle() {
	return this.mrTitle;
    }

    public void setMrTitle(String mrTitle) {
	this.mrTitle = mrTitle;
    }

    @Column(name = "Mr_Details", nullable = false, length = 450)
    public String getMrDetails() {
	return this.mrDetails;
    }

    public void setMrDetails(String mrDetails) {
	this.mrDetails = mrDetails;
    }

    @Column(name = "Mr_Weight", nullable = false, precision = 22, scale = 0)
    public double getMrWeight() {
	return this.mrWeight;
    }

    public void setMrWeight(double mrWeight) {
	this.mrWeight = mrWeight;
    }

    @Column(name = "Summary_rating", nullable = false)
    public int getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(int summaryRating) {
	this.summaryRating = summaryRating;
    }

}
