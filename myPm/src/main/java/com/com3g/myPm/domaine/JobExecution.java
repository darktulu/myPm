package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_execution")
public class JobExecution implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Job_Execution;
    private int jeId;
    private String employeAppraisals;
    private String employe;
    private String jeTitle;
    private String jeDetails;
    private Double jeWeight;
    private Integer summaryRating;

    public JobExecution() {
    }


    public JobExecution(int jeId,String employeAppraisals,String employe, String jeTitle, String jeDetails, Double jeWeight, Integer summaryRating) {
	this.jeId = jeId;
	this.employeAppraisals =employeAppraisals;
	this.employe =employe;
	this.jeTitle = jeTitle;
	this.jeDetails = jeDetails;
	this.jeWeight = jeWeight;
	this.summaryRating = summaryRating;
    }

  
    public Long getId_Job_Execution() {
		return id_Job_Execution;
	}


	public void setId_Job_Execution(Long id_Job_Execution) {
		this.id_Job_Execution = id_Job_Execution;
	}


	@Column(name = "Je_Id", nullable = false)
    public int getJeId() {
	return this.jeId;
    }

    public void setJeId(int jeId) {
	this.jeId = jeId;
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
    @Column(name = "Je_Title", length = 100)
    public String getJeTitle() {
	return this.jeTitle;
    }

    public void setJeTitle(String jeTitle) {
	this.jeTitle = jeTitle;
    }

    @Column(name = "Je_details", length = 450)
    public String getJeDetails() {
	return this.jeDetails;
    }

    public void setJeDetails(String jeDetails) {
	this.jeDetails = jeDetails;
    }

    @Column(name = "Je_Weight", precision = 22, scale = 0)
    public Double getJeWeight() {
	return this.jeWeight;
    }

    public void setJeWeight(Double jeWeight) {
	this.jeWeight = jeWeight;
    }

    @Column(name = "Summary_rating")
    public Integer getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(Integer summaryRating) {
	this.summaryRating = summaryRating;
    }

}
