package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job_execution", catalog = "mypm")
public class JobExecution implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private JobExecutionId id;
    private String jeTitle;
    private String jeDetails;
    private Double jeWeight;
    private Integer summaryRating;

    public JobExecution() {
    }

    public JobExecution(JobExecutionId id) {
	this.id = id;
    }

    public JobExecution(JobExecutionId id, String jeTitle, String jeDetails, Double jeWeight, Integer summaryRating) {
	this.id = id;
	this.jeTitle = jeTitle;
	this.jeDetails = jeDetails;
	this.jeWeight = jeWeight;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "jeId", column = @Column(name = "Je_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 100)) })
    public JobExecutionId getId() {
	return this.id;
    }

    public void setId(JobExecutionId id) {
	this.id = id;
    }

    @Column(name = "Je_Title", length = 100)
    public String getJeTitle() {
	return this.jeTitle;
    }

    public void setJeTitle(String jeTitle) {
	this.jeTitle = jeTitle;
    }

    @Column(name = "Je_details", length = 65535)
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
