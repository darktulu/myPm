package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leadr_depend")
public class LeadrDepend implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Leadr_Depend;
    private int ldId;
    private String employeAppraisals;
    private String employe;
    private String ldTitle;
    private String ldDetails;
    private double ldWeight;
    private int summaryRating;

    public LeadrDepend() {
    }

    public LeadrDepend(int ldId,String employeAppraisals,String employe, String ldTitle, String ldDetails, double ldWeight, int summaryRating) {
	this.ldId = ldId;
	this.employeAppraisals =employeAppraisals;
	this.employe = employe;
	this.ldTitle = ldTitle;
	this.ldDetails = ldDetails;
	this.ldWeight = ldWeight;
	this.summaryRating = summaryRating;
    }
  
    public Long getId_Leadr_Depend() {
		return id_Leadr_Depend;
	}

	public void setId_Leadr_Depend(Long id_Leadr_Depend) {
		this.id_Leadr_Depend = id_Leadr_Depend;
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
    @Column(name = "Employe", nullable = false, length = 50)
    public String getEmploye() {
	return this.employe;
    }

    public void setEmploye(String employe) {
	this.employe = employe;
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
