package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person_attribut", catalog = "mypm")
public class PersonAttribut implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private PersonAttributId id;
    private String paTitle;
    private String paDetails;
    private double paWeight;
    private int summaryRating;

    public PersonAttribut() {
    }

    public PersonAttribut(PersonAttributId id, String paTitle, String paDetails, double paWeight, int summaryRating) {
	this.id = id;
	this.paTitle = paTitle;
	this.paDetails = paDetails;
	this.paWeight = paWeight;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "paId", column = @Column(name = "Pa_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 100)) })
    public PersonAttributId getId() {
	return this.id;
    }

    public void setId(PersonAttributId id) {
	this.id = id;
    }

    @Column(name = "Pa_Title", nullable = false, length = 100)
    public String getPaTitle() {
	return this.paTitle;
    }

    public void setPaTitle(String paTitle) {
	this.paTitle = paTitle;
    }

    @Column(name = "Pa_Details", nullable = false, length = 450)
    public String getPaDetails() {
	return this.paDetails;
    }

    public void setPaDetails(String paDetails) {
	this.paDetails = paDetails;
    }

    @Column(name = "Pa_Weight", nullable = false, precision = 22, scale = 0)
    public double getPaWeight() {
	return this.paWeight;
    }

    public void setPaWeight(double paWeight) {
	this.paWeight = paWeight;
    }

    @Column(name = "Summary_rating", nullable = false)
    public int getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(int summaryRating) {
	this.summaryRating = summaryRating;
    }

}
