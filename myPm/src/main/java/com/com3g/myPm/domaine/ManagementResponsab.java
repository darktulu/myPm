package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "management_responsab")
public class ManagementResponsab implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Manag_Resp;
    private int mrId;
    private String employeAppraisals;
    private String employe;
    private String mrTitle;
    private String mrDetails;
    private double mrWeight;
    private int summaryRating;

    public ManagementResponsab() {
    }

    public ManagementResponsab(int mrId,String employeAppraisals,String employe, String mrTitle, String mrDetails, double mrWeight,
	    int summaryRating) {
	this.mrId = mrId;
	this.employeAppraisals =employeAppraisals;
	this.employe = employe;
	this.mrTitle = mrTitle;
	this.mrDetails = mrDetails;
	this.mrWeight = mrWeight;
	this.summaryRating = summaryRating;
    }

    

    public Long getId_Manag_Resp() {
		return id_Manag_Resp;
	}

	public void setId_Manag_Resp(Long id_Manag_Resp) {
		this.id_Manag_Resp = id_Manag_Resp;
	}

	@Column(name = "Mr_Id", nullable = false)
    public int getMrId() {
	return this.mrId;
    }

    public void setMrId(int mrId) {
	this.mrId = mrId;
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
