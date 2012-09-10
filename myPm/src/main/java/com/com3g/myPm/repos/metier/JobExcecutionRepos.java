package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.com3g.myPm.domaine.JobExecution;


public interface JobExcecutionRepos  extends JpaRepository<JobExecution, Long>{
	
	@Query("from JobExecution where employe =:username")
	public JobExecution finfByemploye(@Param("username") String username);
    
}
