package com.com3g.myPm.domaine;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "code_conduct")
public class CodeConduct implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_code_of_product;
    private int coCId;
    private String employeAppraisals;
    private String employe;
    private String coCTitle;
    private String coCDetails;
    private double coCWeight;
    private int summaryRating;

    public CodeConduct() {
    }

    public CodeConduct(int coCId,String employeAppraisals,String employe, String coCTitle, String coCDetails, double coCWeight, int summaryRating) {
	this.coCId = coCId;
	this.employeAppraisals = employeAppraisals;
	this.employe =employe;
	this.coCTitle = coCTitle;
	this.coCDetails = coCDetails;
	this.coCWeight = coCWeight;
	this.summaryRating = summaryRating;
    }


    public Long getId_code_of_product() {
		return id_code_of_product;
	}

	public void setId_code_of_product(Long id_code_of_product) {
		this.id_code_of_product = id_code_of_product;
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
    @Column(name = "Employe", nullable = false, length = 50)
    public String getEmploye() {
	return this.employe;
    }

    public void setEmploye(String employe) {
	this.employe = employe;
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
