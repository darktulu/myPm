package com.com3g.myPm.domaine;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "business_goals", catalog = "mypm")
public class BusinessGoals implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private BusinessGoalsId id;
    private String goalsTitle;
    private String goalsDetails;
    private Double goalWeight;
    private String midYearReview;
    private Integer summaryRating;
    private String comment;

    public BusinessGoals() {
    }

    public BusinessGoals(BusinessGoalsId id) {
	this.id = id;
    }

    public BusinessGoals(BusinessGoalsId id, String goalsTitle, String goalsDetails, Double goalWeight,
	    String midYearReview, Integer summaryRating) {
	this.id = id;
	this.goalsTitle = goalsTitle;
	this.goalsDetails = goalsDetails;
	this.goalWeight = goalWeight;
	this.midYearReview = midYearReview;
	this.summaryRating = summaryRating;
    }

    @EmbeddedId
    @AttributeOverrides({
	    @AttributeOverride(name = "goalId", column = @Column(name = "Goal_Id", nullable = false)),
	    @AttributeOverride(name = "employeAppraisals", column = @Column(name = "Employe_Appraisals", nullable = false, length = 200)) })
    public BusinessGoalsId getId() {
	return this.id;
    }

    public void setId(BusinessGoalsId id) {
	this.id = id;
    }

    @Column(name = "Goals_Title", length = 100)
    public String getGoalsTitle() {
	return this.goalsTitle;
    }

    public void setGoalsTitle(String goalsTitle) {
	this.goalsTitle = goalsTitle;
    }

    @Column(name = "Goals_details", length = 450)
    public String getGoalsDetails() {
	return this.goalsDetails;
    }

    public void setGoalsDetails(String goalsDetails) {
	this.goalsDetails = goalsDetails;
    }

    @Column(name = "Goal_Weight", precision = 22, scale = 0)
    public Double getGoalWeight() {
	return this.goalWeight;
    }

    public void setGoalWeight(Double goalWeight) {
	this.goalWeight = goalWeight;
    }

    @Column(name = "Mid_Year_Review", length = 50)
    public String getMidYearReview() {
	return this.midYearReview;
    }

    public void setMidYearReview(String midYearReview) {
	this.midYearReview = midYearReview;
    }

    @Column(name = "Summary_rating")
    public Integer getSummaryRating() {
	return this.summaryRating;
    }

    public void setSummaryRating(Integer summaryRating) {
	this.summaryRating = summaryRating;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

}
