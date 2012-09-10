package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_attribut")
public class PersonAttribut implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Person_Attribut;
    private int paId;
    private String employeAppraisals;
    private String employe;
    private String paTitle;
    private String paDetails;
    private double paWeight;
    private int summaryRating;

    public PersonAttribut() {
    }

    public PersonAttribut(int paId,String employeAppraisals,String employe, String paTitle, String paDetails, double paWeight, int summaryRating) {
	this.paId = paId;
	this.employeAppraisals=employeAppraisals;
	this.employe = employe;
	this.paTitle = paTitle;
	this.paDetails = paDetails;
	this.paWeight = paWeight;
	this.summaryRating = summaryRating;
    }

    public Long getId_Person_Attribut() {
		return id_Person_Attribut;
	}

	public void setId_Person_Attribut(Long id_Person_Attribut) {
		this.id_Person_Attribut = id_Person_Attribut;
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
    @Column(name = "Employe", nullable = false, length = 50)
    public String getEmploye() {
	return this.employe;
    }

    public void setEmploye(String employe) {
	this.employe = employe;
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
