package com.com3g.myPm.view.metier;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.JobExecution;
import com.com3g.myPm.repos.metier.JobExcecutionRepos;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean
@RequestScoped
public class EvaluationDetails implements Serializable{
	
	@ManagedProperty(value = "#{userSessionBean}")
	private UserSessionBean userSessionBean;
	@ManagedProperty(value = "#{jobExcecutionRepos}")
	private JobExcecutionRepos jobExcecutionRepos;
	
	private JobExecution jobExecution = new JobExecution();
	
	@PostConstruct
	public void init(){
		
		jobExecution = jobExcecutionRepos.finfByemploye(userSessionBean.getUsername());
		
	}

	public UserSessionBean getUserSessionBean() {
		return userSessionBean;
	}

	public void setUserSessionBean(UserSessionBean userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public JobExcecutionRepos getJobExcecutionRepos() {
		return jobExcecutionRepos;
	}

	public void setJobExcecutionRepos(JobExcecutionRepos jobExcecutionRepos) {
		this.jobExcecutionRepos = jobExcecutionRepos;
	}

	public JobExecution getJobExecution() {
		return jobExecution;
	}

	public void setJobExecution(JobExecution jobExecution) {
		this.jobExecution = jobExecution;
	}
	

}
