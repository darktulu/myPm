package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.com3g.myPm.domaine.ManagementResponsab;


public interface ManagementResponsbRepos  extends JpaRepository<ManagementResponsab, Long>{
	@Query("from ManagementResponsab where employe =:username")
	public ManagementResponsab finfByemploye(@Param("username") String username);
    
}
