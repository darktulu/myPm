package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.JobExecution;
import com.com3g.myPm.domaine.JobExecutionId;

public interface JobExcecutionRepos  extends JpaRepository<JobExecution, JobExecutionId>{
    
}
