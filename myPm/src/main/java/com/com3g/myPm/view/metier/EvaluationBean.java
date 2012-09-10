package com.com3g.myPm.view.metier;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.domaine.JobExecution;
import com.com3g.myPm.repos.metier.JobExcecutionRepos;
import com.com3g.myPm.service.metier.AppraisalsService;
import com.com3g.myPm.service.metier.BusinessGoalsService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean
@ViewScoped
public class EvaluationBean implements Serializable {

	
	private static EGeneralData eGeneralData = new EGeneralData();
	
	private JobExecution jobExecution = new JobExecution();

	private static JobExcecutionRepos jobExcecutionRepos() {
		return SpringJSFUtil.getBean("jobExcecutionRepos");
	}

	private static UserSessionBean userSessionBean() {
		return SpringJSFUtil.getBean("userSessionBean");
	}

	private static AppraisalsService appraisalsService() {
		return SpringJSFUtil.getBean("appraisalsService");
	}

	public void saveJobExecution() {

		jobExecution.setEmploye(eGeneralData.getUsername());
		jobExecution.setEmployeAppraisals((eGeneralData.getUsername()) + "_"
				+ (appraisalsService().getYearOpen()));
		jobExecution.setJeTitle("Job_Execution");
		jobExcecutionRepos().save(jobExecution);
	}

	public EGeneralData geteGeneralData() {
		return eGeneralData;
	}

	public void seteGeneralData(EGeneralData eGeneralData) {
		this.eGeneralData = eGeneralData;
	}

	public JobExecution getJobExecution() {
		return jobExecution;
	}

	public void setJobExecution(JobExecution jobExecution) {
		this.jobExecution = jobExecution;
	}

}
